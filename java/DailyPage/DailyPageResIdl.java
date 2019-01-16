package tbclient.DailyPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes6.dex */
public final class DailyPageResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private DailyPageResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<DailyPageResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(DailyPageResIdl dailyPageResIdl) {
            super(dailyPageResIdl);
            if (dailyPageResIdl != null) {
                this.error = dailyPageResIdl.error;
                this.data = dailyPageResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DailyPageResIdl build(boolean z) {
            return new DailyPageResIdl(this, z);
        }
    }
}