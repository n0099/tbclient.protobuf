package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class UserGrowth extends Message {
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer level_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long score;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long target_score;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<UserTaskInfo> task_info;
    @ProtoField(tag = 4, type = Message.Datatype.DOUBLE)
    public final Double tmoney;
    public static final Integer DEFAULT_LEVEL_ID = 0;
    public static final Long DEFAULT_SCORE = 0L;
    public static final Long DEFAULT_TARGET_SCORE = 0L;
    public static final Double DEFAULT_TMONEY = Double.valueOf(0.0d);
    public static final List<UserTaskInfo> DEFAULT_TASK_INFO = Collections.emptyList();

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<UserGrowth> {
        public Integer level_id;
        public Long score;
        public Long target_score;
        public List<UserTaskInfo> task_info;
        public Double tmoney;

        public Builder() {
        }

        public Builder(UserGrowth userGrowth) {
            super(userGrowth);
            if (userGrowth == null) {
                return;
            }
            this.level_id = userGrowth.level_id;
            this.score = userGrowth.score;
            this.target_score = userGrowth.target_score;
            this.tmoney = userGrowth.tmoney;
            this.task_info = Message.copyOf(userGrowth.task_info);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserGrowth build(boolean z) {
            return new UserGrowth(this, z);
        }
    }

    public UserGrowth(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.level_id;
            if (num == null) {
                this.level_id = DEFAULT_LEVEL_ID;
            } else {
                this.level_id = num;
            }
            Long l = builder.score;
            if (l == null) {
                this.score = DEFAULT_SCORE;
            } else {
                this.score = l;
            }
            Long l2 = builder.target_score;
            if (l2 == null) {
                this.target_score = DEFAULT_TARGET_SCORE;
            } else {
                this.target_score = l2;
            }
            Double d = builder.tmoney;
            if (d == null) {
                this.tmoney = DEFAULT_TMONEY;
            } else {
                this.tmoney = d;
            }
            List<UserTaskInfo> list = builder.task_info;
            if (list == null) {
                this.task_info = DEFAULT_TASK_INFO;
                return;
            } else {
                this.task_info = Message.immutableCopyOf(list);
                return;
            }
        }
        this.level_id = builder.level_id;
        this.score = builder.score;
        this.target_score = builder.target_score;
        this.tmoney = builder.tmoney;
        this.task_info = Message.immutableCopyOf(builder.task_info);
    }
}
