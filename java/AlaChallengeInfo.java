package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class AlaChallengeInfo extends Message {
    public static final String DEFAULT_EXT = "";
    public static final String DEFAULT_RIVAL_HLS_URL = "";
    public static final String DEFAULT_RIVAL_RTMP_URL = "";
    public static final String DEFAULT_RIVAL_SESSION = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long challenge_id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String ext;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String rival_hls_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String rival_rtmp_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String rival_session;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long winning_num;
    public static final Long DEFAULT_CHALLENGE_ID = 0L;
    public static final Long DEFAULT_WINNING_NUM = 0L;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<AlaChallengeInfo> {
        public Long challenge_id;
        public String ext;
        public String rival_hls_url;
        public String rival_rtmp_url;
        public String rival_session;
        public Long winning_num;

        public Builder() {
        }

        public Builder(AlaChallengeInfo alaChallengeInfo) {
            super(alaChallengeInfo);
            if (alaChallengeInfo == null) {
                return;
            }
            this.challenge_id = alaChallengeInfo.challenge_id;
            this.winning_num = alaChallengeInfo.winning_num;
            this.rival_session = alaChallengeInfo.rival_session;
            this.rival_rtmp_url = alaChallengeInfo.rival_rtmp_url;
            this.rival_hls_url = alaChallengeInfo.rival_hls_url;
            this.ext = alaChallengeInfo.ext;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlaChallengeInfo build(boolean z) {
            return new AlaChallengeInfo(this, z);
        }
    }

    public AlaChallengeInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.challenge_id;
            if (l == null) {
                this.challenge_id = DEFAULT_CHALLENGE_ID;
            } else {
                this.challenge_id = l;
            }
            Long l2 = builder.winning_num;
            if (l2 == null) {
                this.winning_num = DEFAULT_WINNING_NUM;
            } else {
                this.winning_num = l2;
            }
            String str = builder.rival_session;
            if (str == null) {
                this.rival_session = "";
            } else {
                this.rival_session = str;
            }
            String str2 = builder.rival_rtmp_url;
            if (str2 == null) {
                this.rival_rtmp_url = "";
            } else {
                this.rival_rtmp_url = str2;
            }
            String str3 = builder.rival_hls_url;
            if (str3 == null) {
                this.rival_hls_url = "";
            } else {
                this.rival_hls_url = str3;
            }
            String str4 = builder.ext;
            if (str4 == null) {
                this.ext = "";
                return;
            } else {
                this.ext = str4;
                return;
            }
        }
        this.challenge_id = builder.challenge_id;
        this.winning_num = builder.winning_num;
        this.rival_session = builder.rival_session;
        this.rival_rtmp_url = builder.rival_rtmp_url;
        this.rival_hls_url = builder.rival_hls_url;
        this.ext = builder.ext;
    }
}
