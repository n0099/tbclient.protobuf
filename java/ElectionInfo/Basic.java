package tbclient.ElectionInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class Basic extends Message {
    public static final String DEFAULT_BEGIN_APPLY_TIME = "";
    public static final String DEFAULT_BEGIN_AUDIT_TIME = "";
    public static final String DEFAULT_BEGIN_PUBLIC_TIME = "";
    public static final String DEFAULT_BEGIN_VOTE_TIME = "";
    public static final String DEFAULT_REMIND_TIME = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String begin_apply_time;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String begin_audit_time;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String begin_public_time;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String begin_vote_time;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer candidate_num;
    @ProtoField(tag = 8, type = Message.Datatype.BOOL)
    public final Boolean is_voted;
    @ProtoField(tag = 9)
    public final NoticeContent notice;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String remind_time;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer status;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer total_vote_num;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Integer DEFAULT_CANDIDATE_NUM = 0;
    public static final Integer DEFAULT_TOTAL_VOTE_NUM = 0;
    public static final Boolean DEFAULT_IS_VOTED = Boolean.FALSE;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Basic> {
        public String begin_apply_time;
        public String begin_audit_time;
        public String begin_public_time;
        public String begin_vote_time;
        public Integer candidate_num;
        public Boolean is_voted;
        public NoticeContent notice;
        public String remind_time;
        public Integer status;
        public Integer total_vote_num;

        public Builder() {
        }

        public Builder(Basic basic) {
            super(basic);
            if (basic == null) {
                return;
            }
            this.begin_apply_time = basic.begin_apply_time;
            this.begin_vote_time = basic.begin_vote_time;
            this.begin_public_time = basic.begin_public_time;
            this.status = basic.status;
            this.remind_time = basic.remind_time;
            this.candidate_num = basic.candidate_num;
            this.total_vote_num = basic.total_vote_num;
            this.is_voted = basic.is_voted;
            this.notice = basic.notice;
            this.begin_audit_time = basic.begin_audit_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Basic build(boolean z) {
            return new Basic(this, z);
        }
    }

    public Basic(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.begin_apply_time;
            if (str == null) {
                this.begin_apply_time = "";
            } else {
                this.begin_apply_time = str;
            }
            String str2 = builder.begin_vote_time;
            if (str2 == null) {
                this.begin_vote_time = "";
            } else {
                this.begin_vote_time = str2;
            }
            String str3 = builder.begin_public_time;
            if (str3 == null) {
                this.begin_public_time = "";
            } else {
                this.begin_public_time = str3;
            }
            Integer num = builder.status;
            if (num == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num;
            }
            String str4 = builder.remind_time;
            if (str4 == null) {
                this.remind_time = "";
            } else {
                this.remind_time = str4;
            }
            Integer num2 = builder.candidate_num;
            if (num2 == null) {
                this.candidate_num = DEFAULT_CANDIDATE_NUM;
            } else {
                this.candidate_num = num2;
            }
            Integer num3 = builder.total_vote_num;
            if (num3 == null) {
                this.total_vote_num = DEFAULT_TOTAL_VOTE_NUM;
            } else {
                this.total_vote_num = num3;
            }
            Boolean bool = builder.is_voted;
            if (bool == null) {
                this.is_voted = DEFAULT_IS_VOTED;
            } else {
                this.is_voted = bool;
            }
            this.notice = builder.notice;
            String str5 = builder.begin_audit_time;
            if (str5 == null) {
                this.begin_audit_time = "";
                return;
            } else {
                this.begin_audit_time = str5;
                return;
            }
        }
        this.begin_apply_time = builder.begin_apply_time;
        this.begin_vote_time = builder.begin_vote_time;
        this.begin_public_time = builder.begin_public_time;
        this.status = builder.status;
        this.remind_time = builder.remind_time;
        this.candidate_num = builder.candidate_num;
        this.total_vote_num = builder.total_vote_num;
        this.is_voted = builder.is_voted;
        this.notice = builder.notice;
        this.begin_audit_time = builder.begin_audit_time;
    }
}
