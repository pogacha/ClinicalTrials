import { Pipe, PipeTransform } from '@angular/core';

@Pipe({ name: 'trialSearchFilter' })
export class TrialSearchFilterPipe implements PipeTransform {

    transform(list: any[], filterText: string): any {


        let filterData = list.filter((val: { eudraCTNumber: string; }) =>
            val.eudraCTNumber.toLowerCase().includes(filterText)
        ).concat(list.filter((val: { trialStatus: string; }) =>
            val.trialStatus.toLowerCase().includes(filterText))).concat(list.filter((val: { trialTypePhase: string; }) =>
                val.trialTypePhase.toLowerCase().includes(filterText))).concat(list.filter((val: { estimatedDuration: string; }) =>
                    val.estimatedDuration.toLowerCase().includes(filterText))).concat(list.filter((val: { therapeuticArea: string; }) =>
                        val.therapeuticArea.toLowerCase().includes(filterText)));

        const key = 'eudraCTNumber';

        filterData = [...new Map(filterData.map((item: { [x: string]: any; }) =>
            [item[key], item])).values()];

        return filterData;
    }
}