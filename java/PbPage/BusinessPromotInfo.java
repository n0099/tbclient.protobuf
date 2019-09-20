package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class BusinessPromotInfo extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_headlinepost;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long is_promot;
    public static final Long DEFAULT_IS_PROMOT = 0L;
    public static final Integer DEFAULT_IS_HEADLINEPOST = 0;

    private BusinessPromotInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.is_promot == null) {
                this.is_promot = DEFAULT_IS_PROMOT;
            } else {
                this.is_promot = builder.is_promot;
            }
            if (builder.is_headlinepost == null) {
                this.is_headlinepost = DEFAULT_IS_HEADLINEPOST;
                return;
            } else {
                this.is_headlinepost = builder.is_headlinepost;
                return;
            }
        }
        this.is_promot = builder.is_promot;
        this.is_headlinepost = builder.is_headlinepost;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<BusinessPromotInfo> {
        public Integer is_headlinepost;
        public Long is_promot;

        public Builder() {
        }

        public Builder(BusinessPromotInfo businessPromotInfo) {
            super(businessPromotInfo);
            if (businessPromotInfo != null) {
                this.is_promot = businessPromotInfo.is_promot;
                this.is_headlinepost = businessPromotInfo.is_headlinepost;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BusinessPromotInfo build(boolean z) {
            return new BusinessPromotInfo(this, z);
        }
    }
}
