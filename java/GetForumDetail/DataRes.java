package tbclient.GetForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.PriManagerApplyInfo;
import tbclient.RecommendForumInfo;
import tbclient.SimpleThreadInfo;
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 5)
    public final ManagerApplyInfo bz_apply_info;
    @ProtoField(tag = 3)
    public final BzApplySwitch bz_apply_switch;
    @ProtoField(tag = 8)
    public final ManagerElectionTab election_tab;
    @ProtoField(tag = 1)
    public final RecommendForumInfo forum_info;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_bawu_show;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer is_complaint_show;
    @ProtoField(tag = 7)
    public final PriManagerApplyInfo pribz_apply_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<SimpleThreadInfo> thread_list;
    public static final List<SimpleThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final Integer DEFAULT_IS_BAWU_SHOW = 0;
    public static final Integer DEFAULT_IS_COMPLAINT_SHOW = 0;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.forum_info = builder.forum_info;
            if (builder.thread_list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = immutableCopyOf(builder.thread_list);
            }
            this.bz_apply_switch = builder.bz_apply_switch;
            if (builder.is_bawu_show == null) {
                this.is_bawu_show = DEFAULT_IS_BAWU_SHOW;
            } else {
                this.is_bawu_show = builder.is_bawu_show;
            }
            this.bz_apply_info = builder.bz_apply_info;
            if (builder.is_complaint_show == null) {
                this.is_complaint_show = DEFAULT_IS_COMPLAINT_SHOW;
            } else {
                this.is_complaint_show = builder.is_complaint_show;
            }
            this.pribz_apply_info = builder.pribz_apply_info;
            this.election_tab = builder.election_tab;
            return;
        }
        this.forum_info = builder.forum_info;
        this.thread_list = immutableCopyOf(builder.thread_list);
        this.bz_apply_switch = builder.bz_apply_switch;
        this.is_bawu_show = builder.is_bawu_show;
        this.bz_apply_info = builder.bz_apply_info;
        this.is_complaint_show = builder.is_complaint_show;
        this.pribz_apply_info = builder.pribz_apply_info;
        this.election_tab = builder.election_tab;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public ManagerApplyInfo bz_apply_info;
        public BzApplySwitch bz_apply_switch;
        public ManagerElectionTab election_tab;
        public RecommendForumInfo forum_info;
        public Integer is_bawu_show;
        public Integer is_complaint_show;
        public PriManagerApplyInfo pribz_apply_info;
        public List<SimpleThreadInfo> thread_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.forum_info = dataRes.forum_info;
                this.thread_list = DataRes.copyOf(dataRes.thread_list);
                this.bz_apply_switch = dataRes.bz_apply_switch;
                this.is_bawu_show = dataRes.is_bawu_show;
                this.bz_apply_info = dataRes.bz_apply_info;
                this.is_complaint_show = dataRes.is_complaint_show;
                this.pribz_apply_info = dataRes.pribz_apply_info;
                this.election_tab = dataRes.election_tab;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
