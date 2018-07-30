package tbclient.DailyPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class DailyPageReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private DailyPageReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DailyPageReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(DailyPageReqIdl dailyPageReqIdl) {
            super(dailyPageReqIdl);
            if (dailyPageReqIdl != null) {
                this.data = dailyPageReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DailyPageReqIdl build(boolean z) {
            return new DailyPageReqIdl(this, z);
        }
    }
}
