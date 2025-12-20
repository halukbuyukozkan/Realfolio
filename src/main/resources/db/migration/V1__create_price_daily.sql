CREATE TABLE price_daily (
    id BIGSERIAL PRIMARY KEY,
    symbol VARCHAR(10) NOT NULL,
    price_date DATE NOT NULL,
    close_price NUMERIC(12,4) NOT NULL,
    CONSTRAINT uk_price_daily_symbol_date UNIQUE (symbol, price_date)
);

CREATE INDEX idx_price_daily_symbol ON price_daily(symbol);

CREATE INDEX idx_price_daily_price_date ON price_daily(price_date);
