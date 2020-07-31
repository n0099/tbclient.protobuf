package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
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

    private VipSpreadList(Builder builder, boolean z) {
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
                this.item = "";
                return;
            } else {
                this.item = builder.item;
                return;
            }
        }
        this.class_name = builder.class_name;
        this.class_url_name = builder.class_url_name;
        this.class_url = builder.class_url;
        this.item = builder.item;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<VipSpreadList> {
        public String class_name;
        public String class_url;
        public String class_url_name;
        public String item;

        public Builder() {
        }

        public Builder(VipSpreadList vipSpreadList) {
            super(vipSpreadList);
            if (vipSpreadList != null) {
                this.class_name = vipSpreadList.class_name;
                this.class_url_name = vipSpreadList.class_url_name;
                this.class_url = vipSpreadList.class_url;
                this.item = vipSpreadList.item;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipSpreadList build(boolean z) {
            return new VipSpreadList(this, z);
        }
    }
}
