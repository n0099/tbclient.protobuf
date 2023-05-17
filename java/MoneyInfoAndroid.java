package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class MoneyInfoAndroid extends Message {
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_MONTHS = "";
    public static final String DEFAULT_PACKET_TEXT = "";
    public static final String DEFAULT_PAYMENT_POS_KEY = "";
    public static final String DEFAULT_PRODUCT_ID = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer _default;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer money;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String months;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer original_cost;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String packet_text;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String payment_pos_key;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String product_id;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer props_id;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer socres;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_PROPS_ID = 0;
    public static final Integer DEFAULT_SOCRES = 0;
    public static final Integer DEFAULT_MONEY = 0;
    public static final Integer DEFAULT_DEFAULT = 0;
    public static final Integer DEFAULT_ORIGINAL_COST = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<MoneyInfoAndroid> {
        public Integer _default;
        public String desc;
        public String icon;
        public Integer money;
        public String months;
        public Integer original_cost;
        public String packet_text;
        public String payment_pos_key;
        public String product_id;
        public Integer props_id;
        public Integer socres;
        public String title;
        public Integer type;

        public Builder() {
        }

        public Builder(MoneyInfoAndroid moneyInfoAndroid) {
            super(moneyInfoAndroid);
            if (moneyInfoAndroid == null) {
                return;
            }
            this.icon = moneyInfoAndroid.icon;
            this.product_id = moneyInfoAndroid.product_id;
            this.type = moneyInfoAndroid.type;
            this.props_id = moneyInfoAndroid.props_id;
            this.title = moneyInfoAndroid.title;
            this.desc = moneyInfoAndroid.desc;
            this.months = moneyInfoAndroid.months;
            this.socres = moneyInfoAndroid.socres;
            this.money = moneyInfoAndroid.money;
            this._default = moneyInfoAndroid._default;
            this.payment_pos_key = moneyInfoAndroid.payment_pos_key;
            this.packet_text = moneyInfoAndroid.packet_text;
            this.original_cost = moneyInfoAndroid.original_cost;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MoneyInfoAndroid build(boolean z) {
            return new MoneyInfoAndroid(this, z);
        }
    }

    public MoneyInfoAndroid(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.icon;
            if (str == null) {
                this.icon = "";
            } else {
                this.icon = str;
            }
            String str2 = builder.product_id;
            if (str2 == null) {
                this.product_id = "";
            } else {
                this.product_id = str2;
            }
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            Integer num2 = builder.props_id;
            if (num2 == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = num2;
            }
            String str3 = builder.title;
            if (str3 == null) {
                this.title = "";
            } else {
                this.title = str3;
            }
            String str4 = builder.desc;
            if (str4 == null) {
                this.desc = "";
            } else {
                this.desc = str4;
            }
            String str5 = builder.months;
            if (str5 == null) {
                this.months = "";
            } else {
                this.months = str5;
            }
            Integer num3 = builder.socres;
            if (num3 == null) {
                this.socres = DEFAULT_SOCRES;
            } else {
                this.socres = num3;
            }
            Integer num4 = builder.money;
            if (num4 == null) {
                this.money = DEFAULT_MONEY;
            } else {
                this.money = num4;
            }
            Integer num5 = builder._default;
            if (num5 == null) {
                this._default = DEFAULT_DEFAULT;
            } else {
                this._default = num5;
            }
            String str6 = builder.payment_pos_key;
            if (str6 == null) {
                this.payment_pos_key = "";
            } else {
                this.payment_pos_key = str6;
            }
            String str7 = builder.packet_text;
            if (str7 == null) {
                this.packet_text = "";
            } else {
                this.packet_text = str7;
            }
            Integer num6 = builder.original_cost;
            if (num6 == null) {
                this.original_cost = DEFAULT_ORIGINAL_COST;
                return;
            } else {
                this.original_cost = num6;
                return;
            }
        }
        this.icon = builder.icon;
        this.product_id = builder.product_id;
        this.type = builder.type;
        this.props_id = builder.props_id;
        this.title = builder.title;
        this.desc = builder.desc;
        this.months = builder.months;
        this.socres = builder.socres;
        this.money = builder.money;
        this._default = builder._default;
        this.payment_pos_key = builder.payment_pos_key;
        this.packet_text = builder.packet_text;
        this.original_cost = builder.original_cost;
    }
}
