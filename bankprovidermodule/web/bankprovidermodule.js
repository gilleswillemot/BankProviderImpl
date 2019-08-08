if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'bankprovidermodule'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'bankprovidermodule'.");
}
if (typeof core === 'undefined') {
  throw new Error("Error loading module 'bankprovidermodule'. Its dependency 'core' was not found. Please, check whether 'core' is loaded prior to 'bankprovidermodule'.");
}
var bankprovidermodule = function (_, Kotlin, $module$core) {
  'use strict';
  var listOf = Kotlin.kotlin.collections.listOf_i5x0yv$;
  var Bank = $module$core.be.abstraction.core.models.Bank;
  var Kind_CLASS = Kotlin.Kind.CLASS;
  var IBankProvider = $module$core.be.abstraction.core.interfaces.IBankProvider;
  var collectionSizeOrDefault = Kotlin.kotlin.collections.collectionSizeOrDefault_ba2ldo$;
  var ArrayList_init = Kotlin.kotlin.collections.ArrayList_init_ww73n8$;
  function BankProvider(banks) {
    this.banks = banks;
  }
  BankProvider.prototype.getBanks = function () {
    var bankNames = listOf(['BNP Paribas', 'ING', 'KBC', 'Europabank', 'Beobank', 'Belfius', 'AXA', 'Argenta']);
    var destination = ArrayList_init(collectionSizeOrDefault(bankNames, 10));
    var tmp$;
    tmp$ = bankNames.iterator();
    while (tmp$.hasNext()) {
      var item = tmp$.next();
      destination.add_11rb$(new Bank(item));
    }
    this.banks = destination;
    return this.banks;
  };
  BankProvider.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'BankProvider',
    interfaces: [IBankProvider]
  };
  var package$be = _.be || (_.be = {});
  var package$abstraction = package$be.abstraction || (package$be.abstraction = {});
  var package$providers = package$abstraction.providers || (package$abstraction.providers = {});
  package$providers.BankProvider = BankProvider;
  Kotlin.defineModule('bankprovidermodule', _);
  return _;
}(typeof bankprovidermodule === 'undefined' ? {} : bankprovidermodule, kotlin, core);
