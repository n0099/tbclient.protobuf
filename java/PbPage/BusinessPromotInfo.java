package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.SendCardInfo;
/* loaded from: classes8.dex */
public final class BusinessPromotInfo extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_headlinepost;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long is_promot;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer is_s_card;
    @ProtoField(tag = 4)
    public final SendCardInfo send_card_info;
    public static final Long DEFAULT_IS_PROMOT = 0L;
    public static final Integer DEFAULT_IS_HEADLINEPOST = 0;
    public static final Integer DEFAULT_IS_S_CARD = 0;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<BusinessPromotInfo> {
        public Integer is_headlinepost;
        public Long is_promot;
        public Integer is_s_card;
        public SendCardInfo send_card_info;

        public Builder() {
        }

        public Builder(BusinessPromotInfo businessPromotInfo) {
            super(businessPromotInfo);
            if (businessPromotInfo == null) {
                return;
            }
            this.is_promot = businessPromotInfo.is_promot;
            this.is_headlinepost = businessPromotInfo.is_headlinepost;
            this.is_s_card = businessPromotInfo.is_s_card;
            this.send_card_info = businessPromotInfo.send_card_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BusinessPromotInfo build(boolean z) {
            return new BusinessPromotInfo(this, z);
        }
    }

    public BusinessPromotInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.is_promot;
            if (l == null) {
                this.is_promot = DEFAULT_IS_PROMOT;
            } else {
                this.is_promot = l;
            }
            Integer num = builder.is_headlinepost;
            if (num == null) {
                this.is_headlinepost = DEFAULT_IS_HEADLINEPOST;
            } else {
                this.is_headlinepost = num;
            }
            Integer num2 = builder.is_s_card;
            if (num2 == null) {
                this.is_s_card = DEFAULT_IS_S_CARD;
            } else {
                this.is_s_card = num2;
            }
            this.send_card_info = builder.send_card_info;
            return;
        }
        this.is_promot = builder.is_promot;
        this.is_headlinepost = builder.is_headlinepost;
        this.is_s_card = builder.is_s_card;
        this.send_card_info = builder.send_card_info;
    }
}
