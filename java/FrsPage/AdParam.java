package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class AdParam extends Message {
    public static final Integer DEFAULT_LOAD_COUNT = 0;
    public static final Integer DEFAULT_REFRESH_COUNT = 0;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer load_count;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer refresh_count;

    private AdParam(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.load_count == null) {
                this.load_count = DEFAULT_LOAD_COUNT;
            } else {
                this.load_count = builder.load_count;
            }
            if (builder.refresh_count == null) {
                this.refresh_count = DEFAULT_REFRESH_COUNT;
                return;
            } else {
                this.refresh_count = builder.refresh_count;
                return;
            }
        }
        this.load_count = builder.load_count;
        this.refresh_count = builder.refresh_count;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<AdParam> {
        public Integer load_count;
        public Integer refresh_count;

        public Builder() {
        }

        public Builder(AdParam adParam) {
            super(adParam);
            if (adParam != null) {
                this.load_count = adParam.load_count;
                this.refresh_count = adParam.refresh_count;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdParam build(boolean z) {
            return new AdParam(this, z);
        }
    }
}
