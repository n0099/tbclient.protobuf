package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class CommonGroup extends Message {
    public static final String DEFAULT_GROUPNAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String groupname;

    /* synthetic */ CommonGroup(Builder builder, boolean z, CommonGroup commonGroup) {
        this(builder, z);
    }

    private CommonGroup(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.groupname == null) {
                this.groupname = "";
                return;
            } else {
                this.groupname = builder.groupname;
                return;
            }
        }
        this.groupname = builder.groupname;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<CommonGroup> {
        public String groupname;

        public Builder(CommonGroup commonGroup) {
            super(commonGroup);
            if (commonGroup != null) {
                this.groupname = commonGroup.groupname;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CommonGroup build(boolean z) {
            return new CommonGroup(this, z, null);
        }
    }
}
