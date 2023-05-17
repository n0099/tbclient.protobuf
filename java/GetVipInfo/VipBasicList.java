package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class VipBasicList extends Message {
    public static final String DEFAULT_CARD_ID = "";
    public static final String DEFAULT_CLASS_NAME = "";
    public static final String DEFAULT_CLASS_URL = "";
    public static final String DEFAULT_CLASS_URL_NAME = "";
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String card_id;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer card_type;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String class_name;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String class_url;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String class_url_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<VipSpecialItem> item;
    public static final List<VipSpecialItem> DEFAULT_ITEM = Collections.emptyList();
    public static final Integer DEFAULT_CARD_TYPE = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<VipBasicList> {
        public String card_id;
        public Integer card_type;
        public String class_name;
        public String class_url;
        public String class_url_name;
        public List<VipSpecialItem> item;

        public Builder() {
        }

        public Builder(VipBasicList vipBasicList) {
            super(vipBasicList);
            if (vipBasicList == null) {
                return;
            }
            this.item = Message.copyOf(vipBasicList.item);
            this.card_type = vipBasicList.card_type;
            this.class_name = vipBasicList.class_name;
            this.class_url_name = vipBasicList.class_url_name;
            this.class_url = vipBasicList.class_url;
            this.card_id = vipBasicList.card_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipBasicList build(boolean z) {
            return new VipBasicList(this, z);
        }
    }

    public VipBasicList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<VipSpecialItem> list = builder.item;
            if (list == null) {
                this.item = DEFAULT_ITEM;
            } else {
                this.item = Message.immutableCopyOf(list);
            }
            Integer num = builder.card_type;
            if (num == null) {
                this.card_type = DEFAULT_CARD_TYPE;
            } else {
                this.card_type = num;
            }
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
            String str4 = builder.card_id;
            if (str4 == null) {
                this.card_id = "";
                return;
            } else {
                this.card_id = str4;
                return;
            }
        }
        this.item = Message.immutableCopyOf(builder.item);
        this.card_type = builder.card_type;
        this.class_name = builder.class_name;
        this.class_url_name = builder.class_url_name;
        this.class_url = builder.class_url;
        this.card_id = builder.card_id;
    }
}
