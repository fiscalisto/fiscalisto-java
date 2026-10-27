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
    private final BankTransactionsService bankTransactions;
    private final PaymentsService payments;
    private final CreditNotesService creditNotes;
    private final AdvancesService advances;
    private final RetentionsService retentions;
    private final EmployeesService employees;
    private final PayrollReceiptsService payrollReceipts;
    private final InvoiceBatchesService invoiceBatches;
    private final TaxIdsService taxIds;
    private final BranchesService branches;
    private final CustomersService customers;
    private final CustomerDataRequestsService customerDataRequests;
    private final ProductsService products;
    private final SatMailboxMessagesService satMailboxMessages;
    private final SatFindingsService satFindings;
    private final WarehousesService warehouses;
    private final StockMovementsService stockMovements;
    private final StockAdjustmentsService stockAdjustments;
    private final SatCatalogsService satCatalogs;
    private final SatListsService satLists;
    private final SatDownloadsService satDownloads;
    private final SatInvoicesService satInvoices;
    private final SatDeclarationsService satDeclarations;
    private final TicketsService tickets;
    private final AccountingService accounting;
    private final StoreConnectionsService storeConnections;
    private final RecurringInvoicesService recurringInvoices;
    private final QuotesService quotes;
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
        this.bankTransactions = new BankTransactionsService(api);
        this.payments = new PaymentsService(api);
        this.creditNotes = new CreditNotesService(api);
        this.advances = new AdvancesService(api);
        this.retentions = new RetentionsService(api);
        this.employees = new EmployeesService(api);
        this.payrollReceipts = new PayrollReceiptsService(api);
        this.invoiceBatches = new InvoiceBatchesService(api);
        this.taxIds = new TaxIdsService(api);
        this.branches = new BranchesService(api);
        this.customers = new CustomersService(api);
        this.customerDataRequests = new CustomerDataRequestsService(api);
        this.products = new ProductsService(api);
        this.satMailboxMessages = new SatMailboxMessagesService(api);
        this.satFindings = new SatFindingsService(api);
        this.warehouses = new WarehousesService(api);
        this.stockMovements = new StockMovementsService(api);
        this.stockAdjustments = new StockAdjustmentsService(api);
        this.satCatalogs = new SatCatalogsService(api);
        this.satLists = new SatListsService(api);
        this.satDownloads = new SatDownloadsService(api);
        this.satInvoices = new SatInvoicesService(api);
        this.satDeclarations = new SatDeclarationsService(api);
        this.tickets = new TicketsService(api);
        this.accounting = new AccountingService(api);
        this.storeConnections = new StoreConnectionsService(api);
        this.recurringInvoices = new RecurringInvoicesService(api);
        this.quotes = new QuotesService(api);
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

    /** Conciliación bancaria. */
    public BankTransactionsService bankTransactions() {
        return bankTransactions;
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

    /** Clientes. */
    public CustomersService customers() {
        return customers;
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

    /** Catálogos del SAT. */
    public SatCatalogsService satCatalogs() {
        return satCatalogs;
    }

    /** Listas del SAT. */
    public SatListsService satLists() {
        return satLists;
    }

    /** Descargas del SAT. */
    public SatDownloadsService satDownloads() {
        return satDownloads;
    }

    /** Descargas del SAT. */
    public SatInvoicesService satInvoices() {
        return satInvoices;
    }

    /** Declaraciones del SAT. */
    public SatDeclarationsService satDeclarations() {
        return satDeclarations;
    }

    /** Autofactura. */
    public TicketsService tickets() {
        return tickets;
    }

    /** Contabilidad. */
    public AccountingService accounting() {
        return accounting;
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

    /** Webhooks. */
    public WebhookEndpointsService webhookEndpoints() {
        return webhookEndpoints;
    }

    /** Eventos. */
    public EventsService events() {
        return events;
    }
}
