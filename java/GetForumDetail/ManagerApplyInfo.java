package tbclient.GetForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class ManagerApplyInfo extends Message {
    public static final String DEFAULT_MANAGER_APPLY_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer manager_apply_status;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String manager_apply_url;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer manager_left_num;
    public static final Integer DEFAULT_MANAGER_LEFT_NUM = 0;
    public static final Integer DEFAULT_MANAGER_APPLY_STATUS = 0;

    private ManagerApplyInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.manager_left_num == null) {
                this.manager_left_num = DEFAULT_MANAGER_LEFT_NUM;
            } else {
                this.manager_left_num = builder.manager_left_num;
            }
            if (builder.manager_apply_url == null) {
                this.manager_apply_url = "";
            } else {
                this.manager_apply_url = builder.manager_apply_url;
            }
            if (builder.manager_apply_status == null) {
                this.manager_apply_status = DEFAULT_MANAGER_APPLY_STATUS;
                return;
            } else {
                this.manager_apply_status = builder.manager_apply_status;
                return;
            }
        }
        this.manager_left_num = builder.manager_left_num;
        this.manager_apply_url = builder.manager_apply_url;
        this.manager_apply_status = builder.manager_apply_status;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ManagerApplyInfo> {
        public Integer manager_apply_status;
        public String manager_apply_url;
        public Integer manager_left_num;

        public Builder() {
        }

        public Builder(ManagerApplyInfo managerApplyInfo) {
            super(managerApplyInfo);
            if (managerApplyInfo != null) {
                this.manager_left_num = managerApplyInfo.manager_left_num;
                this.manager_apply_url = managerApplyInfo.manager_apply_url;
                this.manager_apply_status = managerApplyInfo.manager_apply_status;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ManagerApplyInfo build(boolean z) {
            return new ManagerApplyInfo(this, z);
        }
    }
}
