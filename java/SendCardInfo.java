package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class SendCardInfo extends Message {
    public static final String DEFAULT_CARD_LOGO = "";
    public static final String DEFAULT_CARD_NAME = "";
    public static final String DEFAULT_CARD_PRO = "";
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer card_get_status;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String card_logo;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String card_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String card_pro;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long packet_id;
    public static final Integer DEFAULT_CARD_GET_STATUS = 0;
    public static final Long DEFAULT_PACKET_ID = 0L;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<SendCardInfo> {
        public Integer card_get_status;
        public String card_logo;
        public String card_name;
        public String card_pro;
        public Long packet_id;

        public Builder() {
        }

        public Builder(SendCardInfo sendCardInfo) {
            super(sendCardInfo);
            if (sendCardInfo == null) {
                return;
            }
            this.card_logo = sendCardInfo.card_logo;
            this.card_name = sendCardInfo.card_name;
            this.card_pro = sendCardInfo.card_pro;
            this.card_get_status = sendCardInfo.card_get_status;
            this.packet_id = sendCardInfo.packet_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SendCardInfo build(boolean z) {
            return new SendCardInfo(this, z);
        }
    }

    public SendCardInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.card_logo;
            if (str == null) {
                this.card_logo = "";
            } else {
                this.card_logo = str;
            }
            String str2 = builder.card_name;
            if (str2 == null) {
                this.card_name = "";
            } else {
                this.card_name = str2;
            }
            String str3 = builder.card_pro;
            if (str3 == null) {
                this.card_pro = "";
            } else {
                this.card_pro = str3;
            }
            Integer num = builder.card_get_status;
            if (num == null) {
                this.card_get_status = DEFAULT_CARD_GET_STATUS;
            } else {
                this.card_get_status = num;
            }
            Long l = builder.packet_id;
            if (l == null) {
                this.packet_id = DEFAULT_PACKET_ID;
                return;
            } else {
                this.packet_id = l;
                return;
            }
        }
        this.card_logo = builder.card_logo;
        this.card_name = builder.card_name;
        this.card_pro = builder.card_pro;
        this.card_get_status = builder.card_get_status;
        this.packet_id = builder.packet_id;
    }
}
