import { Pipe, PipeTransform } from '@angular/core';

@Pipe({ name: 'impSearchFilter' })
export class ImpSearchFilterPipe implements PipeTransform {

    transform(list: any[], filterText: string): any {

        let filterData = list.filter((val: { eudraCTNumber: string; }) =>
            val.eudraCTNumber.toLowerCase().includes(filterText)
        ).concat(list.filter((val: { routesOfAdm: string; }) =>
            val.routesOfAdm.toLowerCase().includes(filterText))).concat(list.filter((val: { tradeName: string; }) =>
                val.tradeName.toLowerCase().includes(filterText))).concat(list.filter((val: { productName: string; }) =>
                    val.productName.toLowerCase().includes(filterText))).concat(list.filter((val: { impRole: string; }) =>
                        val.impRole.toLowerCase().includes(filterText))).concat(list.filter((val: { pharmForm: string; }) =>
                            val.pharmForm.toLowerCase().includes(filterText))).concat(list.filter((val: { countryHasMarketingAuth: string; }) =>
                                val.countryHasMarketingAuth.toLowerCase().includes(filterText)));

        const key = 'impId';

        filterData = [...new Map(filterData.map((item: { [x: string]: any; }) =>
            [item[key], item])).values()];

        return filterData;
    }
}