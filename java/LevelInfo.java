package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class LevelInfo extends Message {
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer score;
    public static final Integer DEFAULT_ID = 0;
    public static final Integer DEFAULT_SCORE = 0;

    private LevelInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.score == null) {
                this.score = DEFAULT_SCORE;
                return;
            } else {
                this.score = builder.score;
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.score = builder.score;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<LevelInfo> {
        public Integer id;
        public String name;
        public Integer score;

        public Builder() {
        }

        public Builder(LevelInfo levelInfo) {
            super(levelInfo);
            if (levelInfo != null) {
                this.id = levelInfo.id;
                this.name = levelInfo.name;
                this.score = levelInfo.score;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LevelInfo build(boolean z) {
            return new LevelInfo(this, z);
        }
    }
}
