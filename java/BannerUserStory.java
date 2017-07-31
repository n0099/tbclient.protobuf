package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class BannerUserStory extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer _switch;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<UserStory> user_story;
    public static final List<UserStory> DEFAULT_USER_STORY = Collections.emptyList();
    public static final Integer DEFAULT_SWITCH = 0;

    private BannerUserStory(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_story == null) {
                this.user_story = DEFAULT_USER_STORY;
            } else {
                this.user_story = immutableCopyOf(builder.user_story);
            }
            if (builder._switch == null) {
                this._switch = DEFAULT_SWITCH;
                return;
            } else {
                this._switch = builder._switch;
                return;
            }
        }
        this.user_story = immutableCopyOf(builder.user_story);
        this._switch = builder._switch;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<BannerUserStory> {
        public Integer _switch;
        public List<UserStory> user_story;

        public Builder() {
        }

        public Builder(BannerUserStory bannerUserStory) {
            super(bannerUserStory);
            if (bannerUserStory != null) {
                this.user_story = BannerUserStory.copyOf(bannerUserStory.user_story);
                this._switch = bannerUserStory._switch;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BannerUserStory build(boolean z) {
            return new BannerUserStory(this, z);
        }
    }
}
