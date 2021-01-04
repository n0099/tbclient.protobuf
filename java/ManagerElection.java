package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class ManagerElection extends Message {
    public static final String DEFAULT_TAIL_TEXT = "";
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer begin_vote_time;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer can_vote;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer is_show_distribute;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer remainder_time;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer status;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String tail_text;
    @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
    public final List<String> vote_condition;
    @ProtoField(label = Message.Label.REPEATED, tag = 11, type = Message.Datatype.STRING)
    public final List<String> vote_condition_pic;
    @ProtoField(label = Message.Label.REPEATED, tag = 10, type = Message.Datatype.STRING)
    public final List<String> vote_condition_title;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer vote_num;
    public static final Integer DEFAULT_CAN_VOTE = 0;
    public static final Integer DEFAULT_VOTE_NUM = 0;
    public static final Integer DEFAULT_BEGIN_VOTE_TIME = 0;
    public static final List<String> DEFAULT_VOTE_CONDITION = Collections.emptyList();
    public static final Integer DEFAULT_IS_SHOW_DISTRIBUTE = 0;
    public static final Integer DEFAULT_REMAINDER_TIME = 0;
    public static final Integer DEFAULT_STATUS = 0;
    public static final List<String> DEFAULT_VOTE_CONDITION_TITLE = Collections.emptyList();
    public static final List<String> DEFAULT_VOTE_CONDITION_PIC = Collections.emptyList();

    private ManagerElection(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.can_vote == null) {
                this.can_vote = DEFAULT_CAN_VOTE;
            } else {
                this.can_vote = builder.can_vote;
            }
            if (builder.vote_num == null) {
                this.vote_num = DEFAULT_VOTE_NUM;
            } else {
                this.vote_num = builder.vote_num;
            }
            if (builder.begin_vote_time == null) {
                this.begin_vote_time = DEFAULT_BEGIN_VOTE_TIME;
            } else {
                this.begin_vote_time = builder.begin_vote_time;
            }
            if (builder.vote_condition == null) {
                this.vote_condition = DEFAULT_VOTE_CONDITION;
            } else {
                this.vote_condition = immutableCopyOf(builder.vote_condition);
            }
            if (builder.tail_text == null) {
                this.tail_text = "";
            } else {
                this.tail_text = builder.tail_text;
            }
            if (builder.is_show_distribute == null) {
                this.is_show_distribute = DEFAULT_IS_SHOW_DISTRIBUTE;
            } else {
                this.is_show_distribute = builder.is_show_distribute;
            }
            if (builder.remainder_time == null) {
                this.remainder_time = DEFAULT_REMAINDER_TIME;
            } else {
                this.remainder_time = builder.remainder_time;
            }
            if (builder.status == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = builder.status;
            }
            if (builder.vote_condition_title == null) {
                this.vote_condition_title = DEFAULT_VOTE_CONDITION_TITLE;
            } else {
                this.vote_condition_title = immutableCopyOf(builder.vote_condition_title);
            }
            if (builder.vote_condition_pic == null) {
                this.vote_condition_pic = DEFAULT_VOTE_CONDITION_PIC;
                return;
            } else {
                this.vote_condition_pic = immutableCopyOf(builder.vote_condition_pic);
                return;
            }
        }
        this.can_vote = builder.can_vote;
        this.vote_num = builder.vote_num;
        this.begin_vote_time = builder.begin_vote_time;
        this.vote_condition = immutableCopyOf(builder.vote_condition);
        this.tail_text = builder.tail_text;
        this.is_show_distribute = builder.is_show_distribute;
        this.remainder_time = builder.remainder_time;
        this.status = builder.status;
        this.vote_condition_title = immutableCopyOf(builder.vote_condition_title);
        this.vote_condition_pic = immutableCopyOf(builder.vote_condition_pic);
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ManagerElection> {
        public Integer begin_vote_time;
        public Integer can_vote;
        public Integer is_show_distribute;
        public Integer remainder_time;
        public Integer status;
        public String tail_text;
        public List<String> vote_condition;
        public List<String> vote_condition_pic;
        public List<String> vote_condition_title;
        public Integer vote_num;

        public Builder() {
        }

        public Builder(ManagerElection managerElection) {
            super(managerElection);
            if (managerElection != null) {
                this.can_vote = managerElection.can_vote;
                this.vote_num = managerElection.vote_num;
                this.begin_vote_time = managerElection.begin_vote_time;
                this.vote_condition = ManagerElection.copyOf(managerElection.vote_condition);
                this.tail_text = managerElection.tail_text;
                this.is_show_distribute = managerElection.is_show_distribute;
                this.remainder_time = managerElection.remainder_time;
                this.status = managerElection.status;
                this.vote_condition_title = ManagerElection.copyOf(managerElection.vote_condition_title);
                this.vote_condition_pic = ManagerElection.copyOf(managerElection.vote_condition_pic);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ManagerElection build(boolean z) {
            return new ManagerElection(this, z);
        }
    }
}
