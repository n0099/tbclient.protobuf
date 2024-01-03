package tbclient.GetInterview;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class InterviewDetail extends Message {
    public static final Long DEFAULT_ORDER_ID = 0L;
    @ProtoField(tag = 2)
    public final InterviewInfo answer;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long order_id;
    @ProtoField(tag = 1)
    public final InterviewInfo question;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<InterviewDetail> {
        public InterviewInfo answer;
        public Long order_id;
        public InterviewInfo question;

        public Builder() {
        }

        public Builder(InterviewDetail interviewDetail) {
            super(interviewDetail);
            if (interviewDetail == null) {
                return;
            }
            this.question = interviewDetail.question;
            this.answer = interviewDetail.answer;
            this.order_id = interviewDetail.order_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public InterviewDetail build(boolean z) {
            return new InterviewDetail(this, z);
        }
    }

    public InterviewDetail(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.question = builder.question;
            this.answer = builder.answer;
            Long l = builder.order_id;
            if (l == null) {
                this.order_id = DEFAULT_ORDER_ID;
                return;
            } else {
                this.order_id = l;
                return;
            }
        }
        this.question = builder.question;
        this.answer = builder.answer;
        this.order_id = builder.order_id;
    }
}
