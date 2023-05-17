package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
/* loaded from: classes10.dex */
public final class MatchCardInfo extends Message {
    public static final String DEFAULT_CARD_TITLE = "";
    public static final String DEFAULT_ICON_TEXT = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_START_DESC = "";
    public static final String DEFAULT_TEAM_ICON_A = "";
    public static final String DEFAULT_TEAM_ICON_B = "";
    public static final String DEFAULT_TEAM_NAME_A = "";
    public static final String DEFAULT_TEAM_NAME_B = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String card_title;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String icon_text;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String start_desc;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer status;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String team_icon_a;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String team_icon_b;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String team_name_a;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String team_name_b;
    @ProtoField(tag = 10, type = Message.Datatype.INT64)
    public final Long team_score_a;
    @ProtoField(tag = 11, type = Message.Datatype.INT64)
    public final Long team_score_b;
    @ProtoField(label = Message.Label.REPEATED, tag = 12)
    public final List<ThreadInfo> thread_list;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long topic_id;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_TOPIC_ID = 0L;
    public static final Long DEFAULT_TEAM_SCORE_A = 0L;
    public static final Long DEFAULT_TEAM_SCORE_B = 0L;
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<MatchCardInfo> {
        public String card_title;
        public String icon_text;
        public String name;
        public String start_desc;
        public Integer status;
        public String team_icon_a;
        public String team_icon_b;
        public String team_name_a;
        public String team_name_b;
        public Long team_score_a;
        public Long team_score_b;
        public List<ThreadInfo> thread_list;
        public Long topic_id;

        public Builder() {
        }

        public Builder(MatchCardInfo matchCardInfo) {
            super(matchCardInfo);
            if (matchCardInfo == null) {
                return;
            }
            this.name = matchCardInfo.name;
            this.status = matchCardInfo.status;
            this.card_title = matchCardInfo.card_title;
            this.topic_id = matchCardInfo.topic_id;
            this.team_name_a = matchCardInfo.team_name_a;
            this.team_name_b = matchCardInfo.team_name_b;
            this.team_icon_a = matchCardInfo.team_icon_a;
            this.team_icon_b = matchCardInfo.team_icon_b;
            this.start_desc = matchCardInfo.start_desc;
            this.team_score_a = matchCardInfo.team_score_a;
            this.team_score_b = matchCardInfo.team_score_b;
            this.thread_list = Message.copyOf(matchCardInfo.thread_list);
            this.icon_text = matchCardInfo.icon_text;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MatchCardInfo build(boolean z) {
            return new MatchCardInfo(this, z);
        }
    }

    public MatchCardInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            Integer num = builder.status;
            if (num == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num;
            }
            String str2 = builder.card_title;
            if (str2 == null) {
                this.card_title = "";
            } else {
                this.card_title = str2;
            }
            Long l = builder.topic_id;
            if (l == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = l;
            }
            String str3 = builder.team_name_a;
            if (str3 == null) {
                this.team_name_a = "";
            } else {
                this.team_name_a = str3;
            }
            String str4 = builder.team_name_b;
            if (str4 == null) {
                this.team_name_b = "";
            } else {
                this.team_name_b = str4;
            }
            String str5 = builder.team_icon_a;
            if (str5 == null) {
                this.team_icon_a = "";
            } else {
                this.team_icon_a = str5;
            }
            String str6 = builder.team_icon_b;
            if (str6 == null) {
                this.team_icon_b = "";
            } else {
                this.team_icon_b = str6;
            }
            String str7 = builder.start_desc;
            if (str7 == null) {
                this.start_desc = "";
            } else {
                this.start_desc = str7;
            }
            Long l2 = builder.team_score_a;
            if (l2 == null) {
                this.team_score_a = DEFAULT_TEAM_SCORE_A;
            } else {
                this.team_score_a = l2;
            }
            Long l3 = builder.team_score_b;
            if (l3 == null) {
                this.team_score_b = DEFAULT_TEAM_SCORE_B;
            } else {
                this.team_score_b = l3;
            }
            List<ThreadInfo> list = builder.thread_list;
            if (list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list);
            }
            String str8 = builder.icon_text;
            if (str8 == null) {
                this.icon_text = "";
                return;
            } else {
                this.icon_text = str8;
                return;
            }
        }
        this.name = builder.name;
        this.status = builder.status;
        this.card_title = builder.card_title;
        this.topic_id = builder.topic_id;
        this.team_name_a = builder.team_name_a;
        this.team_name_b = builder.team_name_b;
        this.team_icon_a = builder.team_icon_a;
        this.team_icon_b = builder.team_icon_b;
        this.start_desc = builder.start_desc;
        this.team_score_a = builder.team_score_a;
        this.team_score_b = builder.team_score_b;
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.icon_text = builder.icon_text;
    }
}
