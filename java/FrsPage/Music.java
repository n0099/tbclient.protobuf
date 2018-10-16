package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class Music extends Message {
    public static final String DEFAULT_PIC = "";
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer isopen;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer num;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String pic;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer sid;
    public static final Integer DEFAULT_NUM = 0;
    public static final Integer DEFAULT_SID = 0;
    public static final Integer DEFAULT_ISOPEN = 0;

    private Music(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.pic == null) {
                this.pic = "";
            } else {
                this.pic = builder.pic;
            }
            if (builder.num == null) {
                this.num = DEFAULT_NUM;
            } else {
                this.num = builder.num;
            }
            if (builder.sid == null) {
                this.sid = DEFAULT_SID;
            } else {
                this.sid = builder.sid;
            }
            if (builder.isopen == null) {
                this.isopen = DEFAULT_ISOPEN;
                return;
            } else {
                this.isopen = builder.isopen;
                return;
            }
        }
        this.pic = builder.pic;
        this.num = builder.num;
        this.sid = builder.sid;
        this.isopen = builder.isopen;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<Music> {
        public Integer isopen;
        public Integer num;
        public String pic;
        public Integer sid;

        public Builder() {
        }

        public Builder(Music music) {
            super(music);
            if (music != null) {
                this.pic = music.pic;
                this.num = music.num;
                this.sid = music.sid;
                this.isopen = music.isopen;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Music build(boolean z) {
            return new Music(this, z);
        }
    }
}
