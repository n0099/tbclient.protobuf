package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class WorkCreatorInfo extends Message {
    public static final String DEFAULT_AUTH_DESC = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String auth_desc;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<WorkCreatorInfo> {
        public String auth_desc;

        public Builder() {
        }

        public Builder(WorkCreatorInfo workCreatorInfo) {
            super(workCreatorInfo);
            if (workCreatorInfo == null) {
                return;
            }
            this.auth_desc = workCreatorInfo.auth_desc;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public WorkCreatorInfo build(boolean z) {
            return new WorkCreatorInfo(this, z);
        }
    }

    public WorkCreatorInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.auth_desc;
            if (str == null) {
                this.auth_desc = "";
                return;
            } else {
                this.auth_desc = str;
                return;
            }
        }
        this.auth_desc = builder.auth_desc;
    }
}
