package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class ActiveCenter extends Message {
    public static final String DEFAULT_WIN_DESC = "";
    public static final String DEFAULT_WIN_TITLE = "";
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer is_first_up;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer is_new_window;
    @ProtoField(tag = 3)
    public final ActiveCenterMission mission;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<ActiveCenterStatus> mission_status_list;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String win_desc;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer win_jump_time;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String win_title;
    public static final List<ActiveCenterStatus> DEFAULT_MISSION_STATUS_LIST = Collections.emptyList();
    public static final Integer DEFAULT_WIN_JUMP_TIME = 0;
    public static final Integer DEFAULT_IS_NEW_WINDOW = 0;
    public static final Integer DEFAULT_IS_FIRST_UP = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ActiveCenter> {
        public Integer is_first_up;
        public Integer is_new_window;
        public ActiveCenterMission mission;
        public List<ActiveCenterStatus> mission_status_list;
        public String win_desc;
        public Integer win_jump_time;
        public String win_title;

        public Builder() {
        }

        public Builder(ActiveCenter activeCenter) {
            super(activeCenter);
            if (activeCenter == null) {
                return;
            }
            this.win_title = activeCenter.win_title;
            this.win_desc = activeCenter.win_desc;
            this.mission = activeCenter.mission;
            this.mission_status_list = Message.copyOf(activeCenter.mission_status_list);
            this.win_jump_time = activeCenter.win_jump_time;
            this.is_new_window = activeCenter.is_new_window;
            this.is_first_up = activeCenter.is_first_up;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActiveCenter build(boolean z) {
            return new ActiveCenter(this, z);
        }
    }

    public ActiveCenter(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.win_title;
            if (str == null) {
                this.win_title = "";
            } else {
                this.win_title = str;
            }
            String str2 = builder.win_desc;
            if (str2 == null) {
                this.win_desc = "";
            } else {
                this.win_desc = str2;
            }
            this.mission = builder.mission;
            List<ActiveCenterStatus> list = builder.mission_status_list;
            if (list == null) {
                this.mission_status_list = DEFAULT_MISSION_STATUS_LIST;
            } else {
                this.mission_status_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.win_jump_time;
            if (num == null) {
                this.win_jump_time = DEFAULT_WIN_JUMP_TIME;
            } else {
                this.win_jump_time = num;
            }
            Integer num2 = builder.is_new_window;
            if (num2 == null) {
                this.is_new_window = DEFAULT_IS_NEW_WINDOW;
            } else {
                this.is_new_window = num2;
            }
            Integer num3 = builder.is_first_up;
            if (num3 == null) {
                this.is_first_up = DEFAULT_IS_FIRST_UP;
                return;
            } else {
                this.is_first_up = num3;
                return;
            }
        }
        this.win_title = builder.win_title;
        this.win_desc = builder.win_desc;
        this.mission = builder.mission;
        this.mission_status_list = Message.immutableCopyOf(builder.mission_status_list);
        this.win_jump_time = builder.win_jump_time;
        this.is_new_window = builder.is_new_window;
        this.is_first_up = builder.is_first_up;
    }
}
