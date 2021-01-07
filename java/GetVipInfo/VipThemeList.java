package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class VipThemeList extends Message {
    public static final String DEFAULT_CARD_ID = "";
    public static final String DEFAULT_CLASS_NAME = "";
    public static final String DEFAULT_CLASS_URL = "";
    public static final String DEFAULT_CLASS_URL_NAME = "";
    public static final List<VipThemeItem> DEFAULT_ITEM = Collections.emptyList();
    public static final List<VipThemeItem> DEFAULT_ITEM_CARD = Collections.emptyList();
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String card_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String class_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String class_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String class_url_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<VipThemeItem> item;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<VipThemeItem> item_card;

    private VipThemeList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.class_name == null) {
                this.class_name = "";
            } else {
                this.class_name = builder.class_name;
            }
            if (builder.class_url_name == null) {
                this.class_url_name = "";
            } else {
                this.class_url_name = builder.class_url_name;
            }
            if (builder.class_url == null) {
                this.class_url = "";
            } else {
                this.class_url = builder.class_url;
            }
            if (builder.item == null) {
                this.item = DEFAULT_ITEM;
            } else {
                this.item = immutableCopyOf(builder.item);
            }
            if (builder.item_card == null) {
                this.item_card = DEFAULT_ITEM_CARD;
            } else {
                this.item_card = immutableCopyOf(builder.item_card);
            }
            if (builder.card_id == null) {
                this.card_id = "";
                return;
            } else {
                this.card_id = builder.card_id;
                return;
            }
        }
        this.class_name = builder.class_name;
        this.class_url_name = builder.class_url_name;
        this.class_url = builder.class_url;
        this.item = immutableCopyOf(builder.item);
        this.item_card = immutableCopyOf(builder.item_card);
        this.card_id = builder.card_id;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<VipThemeList> {
        public String card_id;
        public String class_name;
        public String class_url;
        public String class_url_name;
        public List<VipThemeItem> item;
        public List<VipThemeItem> item_card;

        public Builder() {
        }

        public Builder(VipThemeList vipThemeList) {
            super(vipThemeList);
            if (vipThemeList != null) {
                this.class_name = vipThemeList.class_name;
                this.class_url_name = vipThemeList.class_url_name;
                this.class_url = vipThemeList.class_url;
                this.item = VipThemeList.copyOf(vipThemeList.item);
                this.item_card = VipThemeList.copyOf(vipThemeList.item_card);
                this.card_id = vipThemeList.card_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipThemeList build(boolean z) {
            return new VipThemeList(this, z);
        }
    }
}
