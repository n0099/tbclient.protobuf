package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.IconUrlInfo;
/* loaded from: classes2.dex */
public final class BountyCard extends Message {
    public static final String DEFAULT_BONUS = "";
    public static final String DEFAULT_BTN_TEXT = "";
    public static final String DEFAULT_SUBTITLE = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer award_type;
    @ProtoField(tag = 4)
    public final IconUrlInfo bg_img;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String bonus;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String btn_text;
    @ProtoField(label = Message.Label.REPEATED, tag = 8, type = Message.Datatype.STRING)
    public final List<String> gift_imgs;
    @ProtoField(tag = 1)
    public final IconUrlInfo icon;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String subtitle;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String url;
    public static final Integer DEFAULT_AWARD_TYPE = 0;
    public static final List<String> DEFAULT_GIFT_IMGS = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<BountyCard> {
        public Integer award_type;
        public IconUrlInfo bg_img;
        public String bonus;
        public String btn_text;
        public List<String> gift_imgs;
        public IconUrlInfo icon;
        public String subtitle;
        public String title;
        public String url;

        public Builder() {
        }

        public Builder(BountyCard bountyCard) {
            super(bountyCard);
            if (bountyCard == null) {
                return;
            }
            this.icon = bountyCard.icon;
            this.title = bountyCard.title;
            this.subtitle = bountyCard.subtitle;
            this.bg_img = bountyCard.bg_img;
            this.award_type = bountyCard.award_type;
            this.bonus = bountyCard.bonus;
            this.btn_text = bountyCard.btn_text;
            this.gift_imgs = Message.copyOf(bountyCard.gift_imgs);
            this.url = bountyCard.url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BountyCard build(boolean z) {
            return new BountyCard(this, z);
        }
    }

    public BountyCard(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.icon = builder.icon;
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.subtitle;
            if (str2 == null) {
                this.subtitle = "";
            } else {
                this.subtitle = str2;
            }
            this.bg_img = builder.bg_img;
            Integer num = builder.award_type;
            if (num == null) {
                this.award_type = DEFAULT_AWARD_TYPE;
            } else {
                this.award_type = num;
            }
            String str3 = builder.bonus;
            if (str3 == null) {
                this.bonus = "";
            } else {
                this.bonus = str3;
            }
            String str4 = builder.btn_text;
            if (str4 == null) {
                this.btn_text = "";
            } else {
                this.btn_text = str4;
            }
            List<String> list = builder.gift_imgs;
            if (list == null) {
                this.gift_imgs = DEFAULT_GIFT_IMGS;
            } else {
                this.gift_imgs = Message.immutableCopyOf(list);
            }
            String str5 = builder.url;
            if (str5 == null) {
                this.url = "";
                return;
            } else {
                this.url = str5;
                return;
            }
        }
        this.icon = builder.icon;
        this.title = builder.title;
        this.subtitle = builder.subtitle;
        this.bg_img = builder.bg_img;
        this.award_type = builder.award_type;
        this.bonus = builder.bonus;
        this.btn_text = builder.btn_text;
        this.gift_imgs = Message.immutableCopyOf(builder.gift_imgs);
        this.url = builder.url;
    }
}
