package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class VipThemeList extends Message {
    public static final String DEFAULT_CARD_ID = "";
    public static final String DEFAULT_CLASS_NAME = "";
    public static final String DEFAULT_CLASS_URL = "";
    public static final String DEFAULT_CLASS_URL_NAME = "";
    public static final List<VipThemeItem> DEFAULT_ITEM = Collections.emptyList();
    public static final List<VipThemeItem> DEFAULT_ITEM_CARD = Collections.emptyList();
    public static final String DEFAULT_SUB_CLASS_NAME = "";
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
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String sub_class_name;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<VipThemeList> {
        public String card_id;
        public String class_name;
        public String class_url;
        public String class_url_name;
        public List<VipThemeItem> item;
        public List<VipThemeItem> item_card;
        public String sub_class_name;

        public Builder() {
        }

        public Builder(VipThemeList vipThemeList) {
            super(vipThemeList);
            if (vipThemeList == null) {
                return;
            }
            this.class_name = vipThemeList.class_name;
            this.class_url_name = vipThemeList.class_url_name;
            this.class_url = vipThemeList.class_url;
            this.item = Message.copyOf(vipThemeList.item);
            this.item_card = Message.copyOf(vipThemeList.item_card);
            this.card_id = vipThemeList.card_id;
            this.sub_class_name = vipThemeList.sub_class_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipThemeList build(boolean z) {
            return new VipThemeList(this, z);
        }
    }

    public VipThemeList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.class_name;
            if (str == null) {
                this.class_name = "";
            } else {
                this.class_name = str;
            }
            String str2 = builder.class_url_name;
            if (str2 == null) {
                this.class_url_name = "";
            } else {
                this.class_url_name = str2;
            }
            String str3 = builder.class_url;
            if (str3 == null) {
                this.class_url = "";
            } else {
                this.class_url = str3;
            }
            List<VipThemeItem> list = builder.item;
            if (list == null) {
                this.item = DEFAULT_ITEM;
            } else {
                this.item = Message.immutableCopyOf(list);
            }
            List<VipThemeItem> list2 = builder.item_card;
            if (list2 == null) {
                this.item_card = DEFAULT_ITEM_CARD;
            } else {
                this.item_card = Message.immutableCopyOf(list2);
            }
            String str4 = builder.card_id;
            if (str4 == null) {
                this.card_id = "";
            } else {
                this.card_id = str4;
            }
            String str5 = builder.sub_class_name;
            if (str5 == null) {
                this.sub_class_name = "";
                return;
            } else {
                this.sub_class_name = str5;
                return;
            }
        }
        this.class_name = builder.class_name;
        this.class_url_name = builder.class_url_name;
        this.class_url = builder.class_url;
        this.item = Message.immutableCopyOf(builder.item);
        this.item_card = Message.immutableCopyOf(builder.item_card);
        this.card_id = builder.card_id;
        this.sub_class_name = builder.sub_class_name;
    }
}
