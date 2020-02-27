package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class StarTaskInfo extends Message {
    public static final String DEFAULT_TASK_DESC = "";
    public static final String DEFAULT_TASK_SCORE_DESC = "";
    public static final Integer DEFAULT_TASK_STATUS = 0;
    public static final String DEFAULT_TASK_TITLE = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String task_desc;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String task_score_desc;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer task_status;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String task_title;

    private StarTaskInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.task_title == null) {
                this.task_title = "";
            } else {
                this.task_title = builder.task_title;
            }
            if (builder.task_desc == null) {
                this.task_desc = "";
            } else {
                this.task_desc = builder.task_desc;
            }
            if (builder.task_score_desc == null) {
                this.task_score_desc = "";
            } else {
                this.task_score_desc = builder.task_score_desc;
            }
            if (builder.task_status == null) {
                this.task_status = DEFAULT_TASK_STATUS;
                return;
            } else {
                this.task_status = builder.task_status;
                return;
            }
        }
        this.task_title = builder.task_title;
        this.task_desc = builder.task_desc;
        this.task_score_desc = builder.task_score_desc;
        this.task_status = builder.task_status;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<StarTaskInfo> {
        public String task_desc;
        public String task_score_desc;
        public Integer task_status;
        public String task_title;

        public Builder() {
        }

        public Builder(StarTaskInfo starTaskInfo) {
            super(starTaskInfo);
            if (starTaskInfo != null) {
                this.task_title = starTaskInfo.task_title;
                this.task_desc = starTaskInfo.task_desc;
                this.task_score_desc = starTaskInfo.task_score_desc;
                this.task_status = starTaskInfo.task_status;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public StarTaskInfo build(boolean z) {
            return new StarTaskInfo(this, z);
        }
    }
}
