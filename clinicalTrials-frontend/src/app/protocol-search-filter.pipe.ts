import { Pipe, PipeTransform } from '@angular/core';

@Pipe({ name: 'protocolSearchFilter' })
export class ProtocolSearchFilterPipe implements PipeTransform {

    transform(list: any[], filterText: string): any {
        filterText = filterText.toLowerCase()
        let filterData = list.filter((val) =>
            val.eudraCTNumber.toLowerCase().includes(filterText)
        ).concat(list.filter((val) =>
            val.protocolCodeNumber.toLowerCase().includes(filterText))).concat(list.filter((val) =>
                val.fullTitle.toLowerCase().includes(filterText))).concat(list.filter((val) =>
                    val.simplifiedTitle.toLowerCase().includes(filterText))).concat(list.filter((val) =>
                        val.mainObjective.toLowerCase().includes(filterText))).concat(list.filter((val) =>
                            val.safetyObjective.toLowerCase().includes(filterText)));

        const key = 'protocolCodeNumber';
        filterData = [...new Map(filterData.map((item: { [x: string]: any; }) =>
            [item[key], item])).values()];

        return filterData;
    }
}