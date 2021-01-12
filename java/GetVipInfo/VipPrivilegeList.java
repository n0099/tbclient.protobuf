package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
public final class VipPrivilegeList extends Message {
    public static final String DEFAULT_CLASS_NAME = "";
    public static final String DEFAULT_CLASS_URL = "";
    public static final String DEFAULT_CLASS_URL_NAME = "";
    public static final List<VipPrivilegeItem> DEFAULT_ITEM = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String class_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String class_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String class_url_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<VipPrivilegeItem> item;

    private VipPrivilegeList(Builder builder, boolean z) {
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
                return;
            } else {
                this.item = immutableCopyOf(builder.item);
                return;
            }
        }
        this.class_name = builder.class_name;
        this.class_url_name = builder.class_url_name;
        this.class_url = builder.class_url;
        this.item = immutableCopyOf(builder.item);
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<VipPrivilegeList> {
        public String class_name;
        public String class_url;
        public String class_url_name;
        public List<VipPrivilegeItem> item;

        public Builder() {
        }

        public Builder(VipPrivilegeList vipPrivilegeList) {
            super(vipPrivilegeList);
            if (vipPrivilegeList != null) {
                this.class_name = vipPrivilegeList.class_name;
                this.class_url_name = vipPrivilegeList.class_url_name;
                this.class_url = vipPrivilegeList.class_url;
                this.item = VipPrivilegeList.copyOf(vipPrivilegeList.item);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipPrivilegeList build(boolean z) {
            return new VipPrivilegeList(this, z);
        }
    }
}
