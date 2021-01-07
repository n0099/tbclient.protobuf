package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class VipUpgrade extends Message {
    public static final String DEFAULT_BUTTON = "";
    public static final String DEFAULT_CARD_ID = "";
    public static final String DEFAULT_EXPIRE = "";
    public static final String DEFAULT_LINK = "";
    public static final Integer DEFAULT_NORMAL = 0;
    public static final Integer DEFAULT_PAY = 0;
    public static final String DEFAULT_SVIP = "";
    public static final String DEFAULT_TEXT = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String button;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String card_id;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String expire;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer normal;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer pay;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String svip;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String text;

    private VipUpgrade(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.normal == null) {
                this.normal = DEFAULT_NORMAL;
            } else {
                this.normal = builder.normal;
            }
            if (builder.pay == null) {
                this.pay = DEFAULT_PAY;
            } else {
                this.pay = builder.pay;
            }
            if (builder.text == null) {
                this.text = "";
            } else {
                this.text = builder.text;
            }
            if (builder.button == null) {
                this.button = "";
            } else {
                this.button = builder.button;
            }
            if (builder.link == null) {
                this.link = "";
            } else {
                this.link = builder.link;
            }
            if (builder.svip == null) {
                this.svip = "";
            } else {
                this.svip = builder.svip;
            }
            if (builder.expire == null) {
                this.expire = "";
            } else {
                this.expire = builder.expire;
            }
            if (builder.card_id == null) {
                this.card_id = "";
                return;
            } else {
                this.card_id = builder.card_id;
                return;
            }
        }
        this.normal = builder.normal;
        this.pay = builder.pay;
        this.text = builder.text;
        this.button = builder.button;
        this.link = builder.link;
        this.svip = builder.svip;
        this.expire = builder.expire;
        this.card_id = builder.card_id;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<VipUpgrade> {
        public String button;
        public String card_id;
        public String expire;
        public String link;
        public Integer normal;
        public Integer pay;
        public String svip;
        public String text;

        public Builder() {
        }

        public Builder(VipUpgrade vipUpgrade) {
            super(vipUpgrade);
            if (vipUpgrade != null) {
                this.normal = vipUpgrade.normal;
                this.pay = vipUpgrade.pay;
                this.text = vipUpgrade.text;
                this.button = vipUpgrade.button;
                this.link = vipUpgrade.link;
                this.svip = vipUpgrade.svip;
                this.expire = vipUpgrade.expire;
                this.card_id = vipUpgrade.card_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipUpgrade build(boolean z) {
            return new VipUpgrade(this, z);
        }
    }
}
