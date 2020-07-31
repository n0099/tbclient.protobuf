package tbclient.GetHorseRaceLampList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
public final class LiveList extends Message {
    public static final String DEFAULT_LIVE_TITLE = "";
    public static final String DEFAULT_USER_NICKNAME = "";
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer amount;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long live_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String live_title;
    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long rob_end_tm;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer screen_direction;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long user_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String user_nickname;
    public static final Long DEFAULT_LIVE_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_AMOUNT = 0;
    public static final Long DEFAULT_ROB_END_TM = 0L;
    public static final Integer DEFAULT_SCREEN_DIRECTION = 0;

    private LiveList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.live_id == null) {
                this.live_id = DEFAULT_LIVE_ID;
            } else {
                this.live_id = builder.live_id;
            }
            if (builder.live_title == null) {
                this.live_title = "";
            } else {
                this.live_title = builder.live_title;
            }
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.user_nickname == null) {
                this.user_nickname = "";
            } else {
                this.user_nickname = builder.user_nickname;
            }
            if (builder.amount == null) {
                this.amount = DEFAULT_AMOUNT;
            } else {
                this.amount = builder.amount;
            }
            if (builder.rob_end_tm == null) {
                this.rob_end_tm = DEFAULT_ROB_END_TM;
            } else {
                this.rob_end_tm = builder.rob_end_tm;
            }
            if (builder.screen_direction == null) {
                this.screen_direction = DEFAULT_SCREEN_DIRECTION;
                return;
            } else {
                this.screen_direction = builder.screen_direction;
                return;
            }
        }
        this.live_id = builder.live_id;
        this.live_title = builder.live_title;
        this.user_id = builder.user_id;
        this.user_nickname = builder.user_nickname;
        this.amount = builder.amount;
        this.rob_end_tm = builder.rob_end_tm;
        this.screen_direction = builder.screen_direction;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<LiveList> {
        public Integer amount;
        public Long live_id;
        public String live_title;
        public Long rob_end_tm;
        public Integer screen_direction;
        public Long user_id;
        public String user_nickname;

        public Builder() {
        }

        public Builder(LiveList liveList) {
            super(liveList);
            if (liveList != null) {
                this.live_id = liveList.live_id;
                this.live_title = liveList.live_title;
                this.user_id = liveList.user_id;
                this.user_nickname = liveList.user_nickname;
                this.amount = liveList.amount;
                this.rob_end_tm = liveList.rob_end_tm;
                this.screen_direction = liveList.screen_direction;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveList build(boolean z) {
            return new LiveList(this, z);
        }
    }
}
