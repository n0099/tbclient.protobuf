package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class VipSpreadList extends Message {
    public static final String DEFAULT_CLASS_NAME = "";
    public static final String DEFAULT_CLASS_URL = "";
    public static final String DEFAULT_CLASS_URL_NAME = "";
    public static final String DEFAULT_ITEM = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String class_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String class_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String class_url_name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String item;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<VipSpreadList> {
        public String class_name;
        public String class_url;
        public String class_url_name;
        public String item;

        public Builder() {
        }

        public Builder(VipSpreadList vipSpreadList) {
            super(vipSpreadList);
            if (vipSpreadList == null) {
                return;
            }
            this.class_name = vipSpreadList.class_name;
            this.class_url_name = vipSpreadList.class_url_name;
            this.class_url = vipSpreadList.class_url;
            this.item = vipSpreadList.item;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipSpreadList build(boolean z) {
            return new VipSpreadList(this, z);
        }
    }

    public VipSpreadList(Builder builder, boolean z) {
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
            String str4 = builder.item;
            if (str4 == null) {
                this.item = "";
                return;
            } else {
                this.item = str4;
                return;
            }
        }
        this.class_name = builder.class_name;
        this.class_url_name = builder.class_url_name;
        this.class_url = builder.class_url;
        this.item = builder.item;
    }
}
