package tbclient.FinePbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes23.dex */
public final class ZanInfo extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.BOOL)
    public final Boolean is_zan;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long zansum;
    public static final Long DEFAULT_ZANSUM = 0L;
    public static final Boolean DEFAULT_IS_ZAN = false;

    private ZanInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.zansum == null) {
                this.zansum = DEFAULT_ZANSUM;
            } else {
                this.zansum = builder.zansum;
            }
            if (builder.is_zan == null) {
                this.is_zan = DEFAULT_IS_ZAN;
                return;
            } else {
                this.is_zan = builder.is_zan;
                return;
            }
        }
        this.zansum = builder.zansum;
        this.is_zan = builder.is_zan;
    }

    /* loaded from: classes23.dex */
    public static final class Builder extends Message.Builder<ZanInfo> {
        public Boolean is_zan;
        public Long zansum;

        public Builder() {
        }

        public Builder(ZanInfo zanInfo) {
            super(zanInfo);
            if (zanInfo != null) {
                this.zansum = zanInfo.zansum;
                this.is_zan = zanInfo.is_zan;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ZanInfo build(boolean z) {
            return new ZanInfo(this, z);
        }
    }
}
