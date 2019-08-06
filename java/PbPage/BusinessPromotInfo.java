package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class BusinessPromotInfo extends Message {
    public static final Integer DEFAULT_IS_PROMOT = 0;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_promot;

    private BusinessPromotInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.is_promot == null) {
                this.is_promot = DEFAULT_IS_PROMOT;
                return;
            } else {
                this.is_promot = builder.is_promot;
                return;
            }
        }
        this.is_promot = builder.is_promot;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<BusinessPromotInfo> {
        public Integer is_promot;

        public Builder() {
        }

        public Builder(BusinessPromotInfo businessPromotInfo) {
            super(businessPromotInfo);
            if (businessPromotInfo != null) {
                this.is_promot = businessPromotInfo.is_promot;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BusinessPromotInfo build(boolean z) {
            return new BusinessPromotInfo(this, z);
        }
    }
}
