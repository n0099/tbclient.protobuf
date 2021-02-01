package tbclient.GetBawuInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.BawuTeam;
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    public static final Integer DEFAULT_IS_PRIVATE_FORUM = 0;
    @ProtoField(tag = 1)
    public final BawuTeam bawu_team_info;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer is_private_forum;
    @ProtoField(tag = 2)
    public final ManagerApplyInfo manager_apply_info;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.bawu_team_info = builder.bawu_team_info;
            this.manager_apply_info = builder.manager_apply_info;
            if (builder.is_private_forum == null) {
                this.is_private_forum = DEFAULT_IS_PRIVATE_FORUM;
                return;
            } else {
                this.is_private_forum = builder.is_private_forum;
                return;
            }
        }
        this.bawu_team_info = builder.bawu_team_info;
        this.manager_apply_info = builder.manager_apply_info;
        this.is_private_forum = builder.is_private_forum;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public BawuTeam bawu_team_info;
        public Integer is_private_forum;
        public ManagerApplyInfo manager_apply_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.bawu_team_info = dataRes.bawu_team_info;
                this.manager_apply_info = dataRes.manager_apply_info;
                this.is_private_forum = dataRes.is_private_forum;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
