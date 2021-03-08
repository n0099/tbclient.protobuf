package tbclient.MoreTreasureTrove;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AppPosInfo;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_LF_USER = "";
    public static final String DEFAULT_LF_USER_TASKID = "";
    public static final String DEFAULT_TAB_CODE = "";
    @ProtoField(tag = 5)
    public final AppPosInfo app_pos;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f8869common;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String lf_user;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String lf_user_taskid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tab_code;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f8869common = builder.f8870common;
            if (builder.tab_code == null) {
                this.tab_code = "";
            } else {
                this.tab_code = builder.tab_code;
            }
            if (builder.lf_user == null) {
                this.lf_user = "";
            } else {
                this.lf_user = builder.lf_user;
            }
            if (builder.lf_user_taskid == null) {
                this.lf_user_taskid = "";
            } else {
                this.lf_user_taskid = builder.lf_user_taskid;
            }
            this.app_pos = builder.app_pos;
            return;
        }
        this.f8869common = builder.f8870common;
        this.tab_code = builder.tab_code;
        this.lf_user = builder.lf_user;
        this.lf_user_taskid = builder.lf_user_taskid;
        this.app_pos = builder.app_pos;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public AppPosInfo app_pos;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f8870common;
        public String lf_user;
        public String lf_user_taskid;
        public String tab_code;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f8870common = dataReq.f8869common;
                this.tab_code = dataReq.tab_code;
                this.lf_user = dataReq.lf_user;
                this.lf_user_taskid = dataReq.lf_user_taskid;
                this.app_pos = dataReq.app_pos;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
