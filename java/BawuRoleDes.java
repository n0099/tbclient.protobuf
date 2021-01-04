package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class BawuRoleDes extends Message {
    public static final List<BawuRoleInfoPub> DEFAULT_ROLE_INFO = Collections.emptyList();
    public static final String DEFAULT_ROLE_NAME = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<BawuRoleInfoPub> role_info;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String role_name;

    private BawuRoleDes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.role_name == null) {
                this.role_name = "";
            } else {
                this.role_name = builder.role_name;
            }
            if (builder.role_info == null) {
                this.role_info = DEFAULT_ROLE_INFO;
                return;
            } else {
                this.role_info = immutableCopyOf(builder.role_info);
                return;
            }
        }
        this.role_name = builder.role_name;
        this.role_info = immutableCopyOf(builder.role_info);
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<BawuRoleDes> {
        public List<BawuRoleInfoPub> role_info;
        public String role_name;

        public Builder() {
        }

        public Builder(BawuRoleDes bawuRoleDes) {
            super(bawuRoleDes);
            if (bawuRoleDes != null) {
                this.role_name = bawuRoleDes.role_name;
                this.role_info = BawuRoleDes.copyOf(bawuRoleDes.role_info);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BawuRoleDes build(boolean z) {
            return new BawuRoleDes(this, z);
        }
    }
}
