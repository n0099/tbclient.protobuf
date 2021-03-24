package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class VipPrivilegeItem extends Message {
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<VipPrivilegeItem> {
        public String desc;
        public String img_url;
        public String link;
        public String title;

        public Builder() {
        }

        public Builder(VipPrivilegeItem vipPrivilegeItem) {
            super(vipPrivilegeItem);
            if (vipPrivilegeItem == null) {
                return;
            }
            this.img_url = vipPrivilegeItem.img_url;
            this.title = vipPrivilegeItem.title;
            this.desc = vipPrivilegeItem.desc;
            this.link = vipPrivilegeItem.link;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipPrivilegeItem build(boolean z) {
            return new VipPrivilegeItem(this, z);
        }
    }

    public VipPrivilegeItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.img_url;
            if (str == null) {
                this.img_url = "";
            } else {
                this.img_url = str;
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            String str3 = builder.desc;
            if (str3 == null) {
                this.desc = "";
            } else {
                this.desc = str3;
            }
            String str4 = builder.link;
            if (str4 == null) {
                this.link = "";
                return;
            } else {
                this.link = str4;
                return;
            }
        }
        this.img_url = builder.img_url;
        this.title = builder.title;
        this.desc = builder.desc;
        this.link = builder.link;
    }
}
