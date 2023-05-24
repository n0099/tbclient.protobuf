package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class VipSpecialList extends Message {
    public static final String DEFAULT_CARD_ID = "";
    public static final String DEFAULT_CLASS_NAME = "";
    public static final String DEFAULT_CLASS_URL = "";
    public static final String DEFAULT_CLASS_URL_NAME = "";
    public static final String DEFAULT_SUB_CLASS_NAME = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<VipBannerItem> banner_item;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String card_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String class_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String class_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String class_url_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<VipSpecialItem> item;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String sub_class_name;
    public static final List<VipSpecialItem> DEFAULT_ITEM = Collections.emptyList();
    public static final List<VipBannerItem> DEFAULT_BANNER_ITEM = Collections.emptyList();

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<VipSpecialList> {
        public List<VipBannerItem> banner_item;
        public String card_id;
        public String class_name;
        public String class_url;
        public String class_url_name;
        public List<VipSpecialItem> item;
        public String sub_class_name;

        public Builder() {
        }

        public Builder(VipSpecialList vipSpecialList) {
            super(vipSpecialList);
            if (vipSpecialList == null) {
                return;
            }
            this.class_name = vipSpecialList.class_name;
            this.class_url_name = vipSpecialList.class_url_name;
            this.class_url = vipSpecialList.class_url;
            this.item = Message.copyOf(vipSpecialList.item);
            this.card_id = vipSpecialList.card_id;
            this.sub_class_name = vipSpecialList.sub_class_name;
            this.banner_item = Message.copyOf(vipSpecialList.banner_item);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipSpecialList build(boolean z) {
            return new VipSpecialList(this, z);
        }
    }

    public VipSpecialList(Builder builder, boolean z) {
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
            List<VipSpecialItem> list = builder.item;
            if (list == null) {
                this.item = DEFAULT_ITEM;
            } else {
                this.item = Message.immutableCopyOf(list);
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
            } else {
                this.sub_class_name = str5;
            }
            List<VipBannerItem> list2 = builder.banner_item;
            if (list2 == null) {
                this.banner_item = DEFAULT_BANNER_ITEM;
                return;
            } else {
                this.banner_item = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.class_name = builder.class_name;
        this.class_url_name = builder.class_url_name;
        this.class_url = builder.class_url;
        this.item = Message.immutableCopyOf(builder.item);
        this.card_id = builder.card_id;
        this.sub_class_name = builder.sub_class_name;
        this.banner_item = Message.immutableCopyOf(builder.banner_item);
    }
}
