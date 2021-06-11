package tbclient.MoreTreasureTrove;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AppPosInfo;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_LF_USER = "";
    public static final String DEFAULT_LF_USER_TASKID = "";
    public static final String DEFAULT_TAB_CODE = "";
    @ProtoField(tag = 5)
    public final AppPosInfo app_pos;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f72784common;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String lf_user;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String lf_user_taskid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tab_code;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public AppPosInfo app_pos;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f72785common;
        public String lf_user;
        public String lf_user_taskid;
        public String tab_code;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f72785common = dataReq.f72784common;
            this.tab_code = dataReq.tab_code;
            this.lf_user = dataReq.lf_user;
            this.lf_user_taskid = dataReq.lf_user_taskid;
            this.app_pos = dataReq.app_pos;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f72784common = builder.f72785common;
            String str = builder.tab_code;
            if (str == null) {
                this.tab_code = "";
            } else {
                this.tab_code = str;
            }
            String str2 = builder.lf_user;
            if (str2 == null) {
                this.lf_user = "";
            } else {
                this.lf_user = str2;
            }
            String str3 = builder.lf_user_taskid;
            if (str3 == null) {
                this.lf_user_taskid = "";
            } else {
                this.lf_user_taskid = str3;
            }
            this.app_pos = builder.app_pos;
            return;
        }
        this.f72784common = builder.f72785common;
        this.tab_code = builder.tab_code;
        this.lf_user = builder.lf_user;
        this.lf_user_taskid = builder.lf_user_taskid;
        this.app_pos = builder.app_pos;
    }
}
