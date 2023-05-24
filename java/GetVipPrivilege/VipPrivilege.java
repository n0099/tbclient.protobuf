package tbclient.GetVipPrivilege;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class VipPrivilege extends Message {
    public static final String DEFAULT_CLASS_NAME = "";
    public static final List<VipPrivilegeItem> DEFAULT_ITEM = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String class_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<VipPrivilegeItem> item;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<VipPrivilege> {
        public String class_name;
        public List<VipPrivilegeItem> item;

        public Builder() {
        }

        public Builder(VipPrivilege vipPrivilege) {
            super(vipPrivilege);
            if (vipPrivilege == null) {
                return;
            }
            this.class_name = vipPrivilege.class_name;
            this.item = Message.copyOf(vipPrivilege.item);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipPrivilege build(boolean z) {
            return new VipPrivilege(this, z);
        }
    }

    public VipPrivilege(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.class_name;
            if (str == null) {
                this.class_name = "";
            } else {
                this.class_name = str;
            }
            List<VipPrivilegeItem> list = builder.item;
            if (list == null) {
                this.item = DEFAULT_ITEM;
                return;
            } else {
                this.item = Message.immutableCopyOf(list);
                return;
            }
        }
        this.class_name = builder.class_name;
        this.item = Message.immutableCopyOf(builder.item);
    }
}
