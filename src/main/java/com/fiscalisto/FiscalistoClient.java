// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

/**
 * El cliente de la API de Fiscalisto. Cada recurso es un método: {@code client.invoices().create(…)}.
 * <p>
 * {@code var client = new FiscalistoClient();} toma la llave de FISCALISTO_API_KEY. Úselo desde
 * varios hilos: no guarda estado entre llamadas.
 */
public final class FiscalistoClient {
    private final ApiClient api;
    private final AccountService account;
    private final TestDataService testData;
    private final SandboxesService sandboxes;
    private final TestClocksService testClocks;
    private final BalanceService balance;
    private final IssuersService issuers;
    private final InvoicesService invoices;
    private final ReceivablesService receivables;
    private final CustomersService customers;
    private final CashForecastService cashForecast;
    private final BankTransactionsService bankTransactions;
    private final PurchaseReceiptsService purchaseReceipts;
    private final PaymentsService payments;
    private final CreditNotesService creditNotes;
    private final AdvancesService advances;
    private final RetentionsService retentions;
    private final EmployeesService employees;
    private final PayrollReceiptsService payrollReceipts;
    private final PayrollBatchesService payrollBatches;
    private final PayrollBankFilesService payrollBankFiles;
    private final ImssMovementsService imssMovements;
    private final ImssFilesService imssFiles;
    private final EmployeeDeductionsService employeeDeductions;
    private final VariableSalariesService variableSalaries;
    private final AnnualAdjustmentsService annualAdjustments;
    private final PayrollTaxesService payrollTaxes;
    private final InvoiceBatchesService invoiceBatches;
    private final TaxIdsService taxIds;
    private final BranchesService branches;
    private final CostCentersService costCenters;
    private final PriceListsService priceLists;
    private final CustomerGroupsService customerGroups;
    private final PricesService prices;
    private final AttendanceService attendance;
    private final ExpensePeopleService expensePeople;
    private final ExpenseReportsService expenseReports;
    private final ExpensePolicyService expensePolicy;
    private final CustomerDataRequestsService customerDataRequests;
    private final ProductsService products;
    private final SatMailboxMessagesService satMailboxMessages;
    private final SatFindingsService satFindings;
    private final SatFindingCounterpartiesService satFindingCounterparties;
    private final CompanyReportService companyReport;
    private final MaterialitySuppliersService materialitySuppliers;
    private final MaterialityInvoicesService materialityInvoices;
    private final SatReviewsService satReviews;
    private final SatRiskCheckService satRiskCheck;
    private final TaxDiscrepancyService taxDiscrepancy;
    private final WarehousesService warehouses;
    private final StockMovementsService stockMovements;
    private final StockAdjustmentsService stockAdjustments;
    private final ProductionOrdersService productionOrders;
    private final SatCatalogsService satCatalogs;
    private final SatListsService satLists;
    private final CfdiVerificationsService cfdiVerifications;
    private final MembersService members;
    private final InvitationsService invitations;
    private final RolesService roles;
    private final PermissionsService permissions;
    private final ExportsService exports;
    private final SatDownloadsService satDownloads;
    private final SatInvoicesService satInvoices;
    private final SatRetentionsService satRetentions;
    private final PortalSuppliersService portalSuppliers;
    private final SupplierInvoicesService supplierInvoices;
    private final SatDeclarationsService satDeclarations;
    private final SatRefreshesService satRefreshes;
    private final TicketsService tickets;
    private final AccountingService accounting;
    private final ManualEntriesService manualEntries;
    private final OpeningBalancesService openingBalances;
    private final FixedAssetsService fixedAssets;
    private final ClosedPeriodService closedPeriod;
    private final FxRevaluationsService fxRevaluations;
    private final CostOfSalesService costOfSales;
    private final BudgetsService budgets;
    private final InflationAdjustmentsService inflationAdjustments;
    private final InflationAccountsService inflationAccounts;
    private final DepreciationReconciliationsService depreciationReconciliations;
    private final BookDepreciationRatesService bookDepreciationRates;
    private final ChartTemplatesService chartTemplates;
    private final AccountRenumberingsService accountRenumberings;
    private final BooksLogService booksLog;
    private final ConsolidationEliminationsService consolidationEliminations;
    private final EntryTemplatesService entryTemplates;
    private final CostCenterResultsService costCenterResults;
    private final PayrollProvisionsService payrollProvisions;
    private final TaxDeterminationsService taxDeterminations;
    private final LedgerBankAccountsService ledgerBankAccounts;
    private final BankMovementsService bankMovements;
    private final StoreConnectionsService storeConnections;
    private final RecurringInvoicesService recurringInvoices;
    private final QuotesService quotes;
    private final SalesOrdersService salesOrders;
    private final WebhookEndpointsService webhookEndpoints;
    private final EventsService events;

    /** Con la llave de la variable FISCALISTO_API_KEY. */
    public FiscalistoClient() {
        this(ClientOptions.builder().build());
    }

    /** Con su llave fk_test_… o fk_live_…. */
    public FiscalistoClient(String apiKey) {
        this(ClientOptions.builder().apiKey(apiKey).build());
    }

    public FiscalistoClient(ClientOptions options) {
        ApiClient api = new ApiClient(options);
        this.api = api;
        this.account = new AccountService(api);
        this.testData = new TestDataService(api);
        this.sandboxes = new SandboxesService(api);
        this.testClocks = new TestClocksService(api);
        this.balance = new BalanceService(api);
        this.issuers = new IssuersService(api);
        this.invoices = new InvoicesService(api);
        this.receivables = new ReceivablesService(api);
        this.customers = new CustomersService(api);
        this.cashForecast = new CashForecastService(api);
        this.bankTransactions = new BankTransactionsService(api);
        this.purchaseReceipts = new PurchaseReceiptsService(api);
        this.payments = new PaymentsService(api);
        this.creditNotes = new CreditNotesService(api);
        this.advances = new AdvancesService(api);
        this.retentions = new RetentionsService(api);
        this.employees = new EmployeesService(api);
        this.payrollReceipts = new PayrollReceiptsService(api);
        this.payrollBatches = new PayrollBatchesService(api);
        this.payrollBankFiles = new PayrollBankFilesService(api);
        this.imssMovements = new ImssMovementsService(api);
        this.imssFiles = new ImssFilesService(api);
        this.employeeDeductions = new EmployeeDeductionsService(api);
        this.variableSalaries = new VariableSalariesService(api);
        this.annualAdjustments = new AnnualAdjustmentsService(api);
        this.payrollTaxes = new PayrollTaxesService(api);
        this.invoiceBatches = new InvoiceBatchesService(api);
        this.taxIds = new TaxIdsService(api);
        this.branches = new BranchesService(api);
        this.costCenters = new CostCentersService(api);
        this.priceLists = new PriceListsService(api);
        this.customerGroups = new CustomerGroupsService(api);
        this.prices = new PricesService(api);
        this.attendance = new AttendanceService(api);
        this.expensePeople = new ExpensePeopleService(api);
        this.expenseReports = new ExpenseReportsService(api);
        this.expensePolicy = new ExpensePolicyService(api);
        this.customerDataRequests = new CustomerDataRequestsService(api);
        this.products = new ProductsService(api);
        this.satMailboxMessages = new SatMailboxMessagesService(api);
        this.satFindings = new SatFindingsService(api);
        this.satFindingCounterparties = new SatFindingCounterpartiesService(api);
        this.companyReport = new CompanyReportService(api);
        this.materialitySuppliers = new MaterialitySuppliersService(api);
        this.materialityInvoices = new MaterialityInvoicesService(api);
        this.satReviews = new SatReviewsService(api);
        this.satRiskCheck = new SatRiskCheckService(api);
        this.taxDiscrepancy = new TaxDiscrepancyService(api);
        this.warehouses = new WarehousesService(api);
        this.stockMovements = new StockMovementsService(api);
        this.stockAdjustments = new StockAdjustmentsService(api);
        this.productionOrders = new ProductionOrdersService(api);
        this.satCatalogs = new SatCatalogsService(api);
        this.satLists = new SatListsService(api);
        this.cfdiVerifications = new CfdiVerificationsService(api);
        this.members = new MembersService(api);
        this.invitations = new InvitationsService(api);
        this.roles = new RolesService(api);
        this.permissions = new PermissionsService(api);
        this.exports = new ExportsService(api);
        this.satDownloads = new SatDownloadsService(api);
        this.satInvoices = new SatInvoicesService(api);
        this.satRetentions = new SatRetentionsService(api);
        this.portalSuppliers = new PortalSuppliersService(api);
        this.supplierInvoices = new SupplierInvoicesService(api);
        this.satDeclarations = new SatDeclarationsService(api);
        this.satRefreshes = new SatRefreshesService(api);
        this.tickets = new TicketsService(api);
        this.accounting = new AccountingService(api);
        this.manualEntries = new ManualEntriesService(api);
        this.openingBalances = new OpeningBalancesService(api);
        this.fixedAssets = new FixedAssetsService(api);
        this.closedPeriod = new ClosedPeriodService(api);
        this.fxRevaluations = new FxRevaluationsService(api);
        this.costOfSales = new CostOfSalesService(api);
        this.budgets = new BudgetsService(api);
        this.inflationAdjustments = new InflationAdjustmentsService(api);
        this.inflationAccounts = new InflationAccountsService(api);
        this.depreciationReconciliations = new DepreciationReconciliationsService(api);
        this.bookDepreciationRates = new BookDepreciationRatesService(api);
        this.chartTemplates = new ChartTemplatesService(api);
        this.accountRenumberings = new AccountRenumberingsService(api);
        this.booksLog = new BooksLogService(api);
        this.consolidationEliminations = new ConsolidationEliminationsService(api);
        this.entryTemplates = new EntryTemplatesService(api);
        this.costCenterResults = new CostCenterResultsService(api);
        this.payrollProvisions = new PayrollProvisionsService(api);
        this.taxDeterminations = new TaxDeterminationsService(api);
        this.ledgerBankAccounts = new LedgerBankAccountsService(api);
        this.bankMovements = new BankMovementsService(api);
        this.storeConnections = new StoreConnectionsService(api);
        this.recurringInvoices = new RecurringInvoicesService(api);
        this.quotes = new QuotesService(api);
        this.salesOrders = new SalesOrdersService(api);
        this.webhookEndpoints = new WebhookEndpointsService(api);
        this.events = new EventsService(api);
    }

    /** true con una llave fk_live_ (producción), false con fk_test_ (pruebas). */
    public boolean livemode() {
        return api.livemode();
    }

    /** Cuenta. */
    public AccountService account() {
        return account;
    }

    /** Cuenta. */
    public TestDataService testData() {
        return testData;
    }

    /** Entornos de prueba. */
    public SandboxesService sandboxes() {
        return sandboxes;
    }

    /** Entornos de prueba. */
    public TestClocksService testClocks() {
        return testClocks;
    }

    /** Cuenta. */
    public BalanceService balance() {
        return balance;
    }

    /** Emisores. */
    public IssuersService issuers() {
        return issuers;
    }

    /** Facturas. */
    public InvoicesService invoices() {
        return invoices;
    }

    /** Cuentas por cobrar. */
    public ReceivablesService receivables() {
        return receivables;
    }

    /** Cuentas por cobrar. */
    public CustomersService customers() {
        return customers;
    }

    /** Flujo de efectivo. */
    public CashForecastService cashForecast() {
        return cashForecast;
    }

    /** Conciliación bancaria. */
    public BankTransactionsService bankTransactions() {
        return bankTransactions;
    }

    /** Tickets de compra. */
    public PurchaseReceiptsService purchaseReceipts() {
        return purchaseReceipts;
    }

    /** Pagos y notas de crédito. */
    public PaymentsService payments() {
        return payments;
    }

    /** Pagos y notas de crédito. */
    public CreditNotesService creditNotes() {
        return creditNotes;
    }

    /** Anticipos. */
    public AdvancesService advances() {
        return advances;
    }

    /** Retenciones. */
    public RetentionsService retentions() {
        return retentions;
    }

    /** Nómina. */
    public EmployeesService employees() {
        return employees;
    }

    /** Nómina. */
    public PayrollReceiptsService payrollReceipts() {
        return payrollReceipts;
    }

    /** Nómina. */
    public PayrollBatchesService payrollBatches() {
        return payrollBatches;
    }

    /** Nómina. */
    public PayrollBankFilesService payrollBankFiles() {
        return payrollBankFiles;
    }

    /** Nómina. */
    public ImssMovementsService imssMovements() {
        return imssMovements;
    }

    /** Nómina. */
    public ImssFilesService imssFiles() {
        return imssFiles;
    }

    /** Nómina. */
    public EmployeeDeductionsService employeeDeductions() {
        return employeeDeductions;
    }

    /** Nómina. */
    public VariableSalariesService variableSalaries() {
        return variableSalaries;
    }

    /** Nómina. */
    public AnnualAdjustmentsService annualAdjustments() {
        return annualAdjustments;
    }

    /** Nómina. */
    public PayrollTaxesService payrollTaxes() {
        return payrollTaxes;
    }

    /** Lotes. */
    public InvoiceBatchesService invoiceBatches() {
        return invoiceBatches;
    }

    /** Clientes. */
    public TaxIdsService taxIds() {
        return taxIds;
    }

    /** Sucursales. */
    public BranchesService branches() {
        return branches;
    }

    /** Centros de costo. */
    public CostCentersService costCenters() {
        return costCenters;
    }

    /** Listas de precios. */
    public PriceListsService priceLists() {
        return priceLists;
    }

    /** Listas de precios. */
    public CustomerGroupsService customerGroups() {
        return customerGroups;
    }

    /** Listas de precios. */
    public PricesService prices() {
        return prices;
    }

    /** Asistencia. */
    public AttendanceService attendance() {
        return attendance;
    }

    /** Viáticos y gastos. */
    public ExpensePeopleService expensePeople() {
        return expensePeople;
    }

    /** Viáticos y gastos. */
    public ExpenseReportsService expenseReports() {
        return expenseReports;
    }

    /** Viáticos y gastos. */
    public ExpensePolicyService expensePolicy() {
        return expensePolicy;
    }

    /** Clientes. */
    public CustomerDataRequestsService customerDataRequests() {
        return customerDataRequests;
    }

    /** Productos. */
    public ProductsService products() {
        return products;
    }

    /** Cumplimiento SAT. */
    public SatMailboxMessagesService satMailboxMessages() {
        return satMailboxMessages;
    }

    /** Cumplimiento SAT. */
    public SatFindingsService satFindings() {
        return satFindings;
    }

    /** Cumplimiento SAT. */
    public SatFindingCounterpartiesService satFindingCounterparties() {
        return satFindingCounterparties;
    }

    /** Cumplimiento SAT. */
    public CompanyReportService companyReport() {
        return companyReport;
    }

    /** Cumplimiento SAT. */
    public MaterialitySuppliersService materialitySuppliers() {
        return materialitySuppliers;
    }

    /** Cumplimiento SAT. */
    public MaterialityInvoicesService materialityInvoices() {
        return materialityInvoices;
    }

    /** Cumplimiento SAT. */
    public SatReviewsService satReviews() {
        return satReviews;
    }

    /** Cumplimiento SAT. */
    public SatRiskCheckService satRiskCheck() {
        return satRiskCheck;
    }

    /** Cumplimiento SAT. */
    public TaxDiscrepancyService taxDiscrepancy() {
        return taxDiscrepancy;
    }

    /** Inventario. */
    public WarehousesService warehouses() {
        return warehouses;
    }

    /** Inventario. */
    public StockMovementsService stockMovements() {
        return stockMovements;
    }

    /** Inventario. */
    public StockAdjustmentsService stockAdjustments() {
        return stockAdjustments;
    }

    /** Inventario. */
    public ProductionOrdersService productionOrders() {
        return productionOrders;
    }

    /** Catálogos del SAT. */
    public SatCatalogsService satCatalogs() {
        return satCatalogs;
    }

    /** Listas del SAT. */
    public SatListsService satLists() {
        return satLists;
    }

    /** Verificar comprobantes. */
    public CfdiVerificationsService cfdiVerifications() {
        return cfdiVerifications;
    }

    /** Equipo. */
    public MembersService members() {
        return members;
    }

    /** Equipo. */
    public InvitationsService invitations() {
        return invitations;
    }

    /** Equipo. */
    public RolesService roles() {
        return roles;
    }

    /** Equipo. */
    public PermissionsService permissions() {
        return permissions;
    }

    /** Exportaciones. */
    public ExportsService exports() {
        return exports;
    }

    /** Descargas del SAT. */
    public SatDownloadsService satDownloads() {
        return satDownloads;
    }

    /** Descargas del SAT. */
    public SatInvoicesService satInvoices() {
        return satInvoices;
    }

    /** Descargas del SAT. */
    public SatRetentionsService satRetentions() {
        return satRetentions;
    }

    /** Portal de proveedores. */
    public PortalSuppliersService portalSuppliers() {
        return portalSuppliers;
    }

    /** Portal de proveedores. */
    public SupplierInvoicesService supplierInvoices() {
        return supplierInvoices;
    }

    /** Declaraciones del SAT. */
    public SatDeclarationsService satDeclarations() {
        return satDeclarations;
    }

    /** Declaraciones del SAT. */
    public SatRefreshesService satRefreshes() {
        return satRefreshes;
    }

    /** Autofactura. */
    public TicketsService tickets() {
        return tickets;
    }

    /** Contabilidad. */
    public AccountingService accounting() {
        return accounting;
    }

    /** Contabilidad. */
    public ManualEntriesService manualEntries() {
        return manualEntries;
    }

    /** Contabilidad. */
    public OpeningBalancesService openingBalances() {
        return openingBalances;
    }

    /** Contabilidad. */
    public FixedAssetsService fixedAssets() {
        return fixedAssets;
    }

    /** Contabilidad. */
    public ClosedPeriodService closedPeriod() {
        return closedPeriod;
    }

    /** Contabilidad. */
    public FxRevaluationsService fxRevaluations() {
        return fxRevaluations;
    }

    /** Contabilidad. */
    public CostOfSalesService costOfSales() {
        return costOfSales;
    }

    /** Contabilidad. */
    public BudgetsService budgets() {
        return budgets;
    }

    /** Contabilidad. */
    public InflationAdjustmentsService inflationAdjustments() {
        return inflationAdjustments;
    }

    /** Contabilidad. */
    public InflationAccountsService inflationAccounts() {
        return inflationAccounts;
    }

    /** Contabilidad. */
    public DepreciationReconciliationsService depreciationReconciliations() {
        return depreciationReconciliations;
    }

    /** Contabilidad. */
    public BookDepreciationRatesService bookDepreciationRates() {
        return bookDepreciationRates;
    }

    /** Contabilidad. */
    public ChartTemplatesService chartTemplates() {
        return chartTemplates;
    }

    /** Contabilidad. */
    public AccountRenumberingsService accountRenumberings() {
        return accountRenumberings;
    }

    /** Contabilidad. */
    public BooksLogService booksLog() {
        return booksLog;
    }

    /** Contabilidad. */
    public ConsolidationEliminationsService consolidationEliminations() {
        return consolidationEliminations;
    }

    /** Contabilidad. */
    public EntryTemplatesService entryTemplates() {
        return entryTemplates;
    }

    /** Contabilidad. */
    public CostCenterResultsService costCenterResults() {
        return costCenterResults;
    }

    /** Contabilidad. */
    public PayrollProvisionsService payrollProvisions() {
        return payrollProvisions;
    }

    /** Contabilidad. */
    public TaxDeterminationsService taxDeterminations() {
        return taxDeterminations;
    }

    /** Contabilidad. */
    public LedgerBankAccountsService ledgerBankAccounts() {
        return ledgerBankAccounts;
    }

    /** Contabilidad. */
    public BankMovementsService bankMovements() {
        return bankMovements;
    }

    /** Tiendas en línea. */
    public StoreConnectionsService storeConnections() {
        return storeConnections;
    }

    /** Facturas recurrentes. */
    public RecurringInvoicesService recurringInvoices() {
        return recurringInvoices;
    }

    /** Cotizaciones. */
    public QuotesService quotes() {
        return quotes;
    }

    /** Pedidos. */
    public SalesOrdersService salesOrders() {
        return salesOrders;
    }

    /** Webhooks. */
    public WebhookEndpointsService webhookEndpoints() {
        return webhookEndpoints;
    }

    /** Eventos. */
    public EventsService events() {
        return events;
    }
}
