package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class ForumGodInfo extends Message {
    public static final String DEFAULT_INTRO = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long fid;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String intro;
    public static final Long DEFAULT_ID = 0L;
    public static final Long DEFAULT_FID = 0L;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ForumGodInfo> {
        public Long fid;
        public Long id;
        public String intro;

        public Builder() {
        }

        public Builder(ForumGodInfo forumGodInfo) {
            super(forumGodInfo);
            if (forumGodInfo == null) {
                return;
            }
            this.id = forumGodInfo.id;
            this.fid = forumGodInfo.fid;
            this.intro = forumGodInfo.intro;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumGodInfo build(boolean z) {
            return new ForumGodInfo(this, z);
        }
    }

    public ForumGodInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            Long l2 = builder.fid;
            if (l2 == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = l2;
            }
            String str = builder.intro;
            if (str == null) {
                this.intro = "";
                return;
            } else {
                this.intro = str;
                return;
            }
        }
        this.id = builder.id;
        this.fid = builder.fid;
        this.intro = builder.intro;
    }
}
