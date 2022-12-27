package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class LiveAchievementInfo extends Message {
    public static final Long DEFAULT_ACHIEVEMENT_ID = 0L;
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_ICON_TEXT = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long achievement_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon_text;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<LiveAchievementInfo> {
        public Long achievement_id;
        public String icon;
        public String icon_text;

        public Builder() {
        }

        public Builder(LiveAchievementInfo liveAchievementInfo) {
            super(liveAchievementInfo);
            if (liveAchievementInfo == null) {
                return;
            }
            this.achievement_id = liveAchievementInfo.achievement_id;
            this.icon = liveAchievementInfo.icon;
            this.icon_text = liveAchievementInfo.icon_text;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveAchievementInfo build(boolean z) {
            return new LiveAchievementInfo(this, z);
        }
    }

    public LiveAchievementInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.achievement_id;
            if (l == null) {
                this.achievement_id = DEFAULT_ACHIEVEMENT_ID;
            } else {
                this.achievement_id = l;
            }
            String str = builder.icon;
            if (str == null) {
                this.icon = "";
            } else {
                this.icon = str;
            }
            String str2 = builder.icon_text;
            if (str2 == null) {
                this.icon_text = "";
                return;
            } else {
                this.icon_text = str2;
                return;
            }
        }
        this.achievement_id = builder.achievement_id;
        this.icon = builder.icon;
        this.icon_text = builder.icon_text;
    }
}
