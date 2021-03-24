package tbclient.GetBawuInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ManagerApplyInfo extends Message {
    public static final String DEFAULT_ASSIST_APPLY_URL = "";
    public static final String DEFAULT_MANAGER_APPLY_URL = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String assist_apply_url;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer assist_left_num;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String manager_apply_url;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer manager_left_num;
    public static final Integer DEFAULT_MANAGER_LEFT_NUM = 0;
    public static final Integer DEFAULT_ASSIST_LEFT_NUM = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ManagerApplyInfo> {
        public String assist_apply_url;
        public Integer assist_left_num;
        public String manager_apply_url;
        public Integer manager_left_num;

        public Builder() {
        }

        public Builder(ManagerApplyInfo managerApplyInfo) {
            super(managerApplyInfo);
            if (managerApplyInfo == null) {
                return;
            }
            this.manager_left_num = managerApplyInfo.manager_left_num;
            this.manager_apply_url = managerApplyInfo.manager_apply_url;
            this.assist_left_num = managerApplyInfo.assist_left_num;
            this.assist_apply_url = managerApplyInfo.assist_apply_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ManagerApplyInfo build(boolean z) {
            return new ManagerApplyInfo(this, z);
        }
    }

    public ManagerApplyInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.manager_left_num;
            if (num == null) {
                this.manager_left_num = DEFAULT_MANAGER_LEFT_NUM;
            } else {
                this.manager_left_num = num;
            }
            String str = builder.manager_apply_url;
            if (str == null) {
                this.manager_apply_url = "";
            } else {
                this.manager_apply_url = str;
            }
            Integer num2 = builder.assist_left_num;
            if (num2 == null) {
                this.assist_left_num = DEFAULT_ASSIST_LEFT_NUM;
            } else {
                this.assist_left_num = num2;
            }
            String str2 = builder.assist_apply_url;
            if (str2 == null) {
                this.assist_apply_url = "";
                return;
            } else {
                this.assist_apply_url = str2;
                return;
            }
        }
        this.manager_left_num = builder.manager_left_num;
        this.manager_apply_url = builder.manager_apply_url;
        this.assist_left_num = builder.assist_left_num;
        this.assist_apply_url = builder.assist_apply_url;
    }
}
