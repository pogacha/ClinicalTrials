import { Pipe, PipeTransform } from '@angular/core';

@Pipe({ name: 'sponsorSearchFilter' })
export class SponsorSearchFilterPipe implements PipeTransform {

    transform(list: any[], filterText: string): any {
        filterText = filterText.toLowerCase()
        let filterData = list.filter((val) =>
            val.sponsorId.toLowerCase().includes(filterText)
        ).concat(list.filter((val) =>
            val.sponsorName.toLowerCase().includes(filterText))).concat(list.filter((val) =>
                val.sponsorName.toLowerCase().includes(filterText))).concat(list.filter((val) =>
                    val.sponsorStatus.toLowerCase().includes(filterText))).concat(list.filter((val) =>
                        val.nameOfSupportingOrg.toLowerCase().includes(filterText)));

        const key = 'sponsorId';
        filterData = [...new Map(filterData.map((item: { [x: string]: any; }) =>
            [item[key], item])).values()];

        return filterData;
    }
}