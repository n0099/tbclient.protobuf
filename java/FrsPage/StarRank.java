package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public final class StarRank extends Message {
    public static final String DEFAULT_RANK_NAME = "";
    public static final String DEFAULT_URL = "";
    public static final String DEFAULT_USER_CURRENT_SCORE_NOTICE = "";
    public static final String DEFAULT_USER_TASK_NOTICE = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<StarContriRecord> contri_record_list;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String rank_name;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer rank_ranking;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String url;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer user_contri_score;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String user_current_score_notice;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<StarTaskInfo> user_task_info;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String user_task_notice;
    public static final Integer DEFAULT_RANK_RANKING = 0;
    public static final List<StarContriRecord> DEFAULT_CONTRI_RECORD_LIST = Collections.emptyList();
    public static final Integer DEFAULT_USER_CONTRI_SCORE = 0;
    public static final List<StarTaskInfo> DEFAULT_USER_TASK_INFO = Collections.emptyList();

    private StarRank(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.rank_name == null) {
                this.rank_name = "";
            } else {
                this.rank_name = builder.rank_name;
            }
            if (builder.rank_ranking == null) {
                this.rank_ranking = DEFAULT_RANK_RANKING;
            } else {
                this.rank_ranking = builder.rank_ranking;
            }
            if (builder.contri_record_list == null) {
                this.contri_record_list = DEFAULT_CONTRI_RECORD_LIST;
            } else {
                this.contri_record_list = immutableCopyOf(builder.contri_record_list);
            }
            if (builder.user_contri_score == null) {
                this.user_contri_score = DEFAULT_USER_CONTRI_SCORE;
            } else {
                this.user_contri_score = builder.user_contri_score;
            }
            if (builder.user_task_notice == null) {
                this.user_task_notice = "";
            } else {
                this.user_task_notice = builder.user_task_notice;
            }
            if (builder.user_task_info == null) {
                this.user_task_info = DEFAULT_USER_TASK_INFO;
            } else {
                this.user_task_info = immutableCopyOf(builder.user_task_info);
            }
            if (builder.user_current_score_notice == null) {
                this.user_current_score_notice = "";
            } else {
                this.user_current_score_notice = builder.user_current_score_notice;
            }
            if (builder.url == null) {
                this.url = "";
                return;
            } else {
                this.url = builder.url;
                return;
            }
        }
        this.rank_name = builder.rank_name;
        this.rank_ranking = builder.rank_ranking;
        this.contri_record_list = immutableCopyOf(builder.contri_record_list);
        this.user_contri_score = builder.user_contri_score;
        this.user_task_notice = builder.user_task_notice;
        this.user_task_info = immutableCopyOf(builder.user_task_info);
        this.user_current_score_notice = builder.user_current_score_notice;
        this.url = builder.url;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<StarRank> {
        public List<StarContriRecord> contri_record_list;
        public String rank_name;
        public Integer rank_ranking;
        public String url;
        public Integer user_contri_score;
        public String user_current_score_notice;
        public List<StarTaskInfo> user_task_info;
        public String user_task_notice;

        public Builder() {
        }

        public Builder(StarRank starRank) {
            super(starRank);
            if (starRank != null) {
                this.rank_name = starRank.rank_name;
                this.rank_ranking = starRank.rank_ranking;
                this.contri_record_list = StarRank.copyOf(starRank.contri_record_list);
                this.user_contri_score = starRank.user_contri_score;
                this.user_task_notice = starRank.user_task_notice;
                this.user_task_info = StarRank.copyOf(starRank.user_task_info);
                this.user_current_score_notice = starRank.user_current_score_notice;
                this.url = starRank.url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public StarRank build(boolean z) {
            return new StarRank(this, z);
        }
    }
}
