package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class PicDecoration extends Message {
    public static final List<FeedKV> DEFAULT_DECORATION_INFO = Collections.emptyList();
    public static final String DEFAULT_LOCATION = "";
    public static final String DEFAULT_NAME = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<FeedKV> decoration_info;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String location;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<PicDecoration> {
        public List<FeedKV> decoration_info;
        public String location;
        public String name;

        public Builder() {
        }

        public Builder(PicDecoration picDecoration) {
            super(picDecoration);
            if (picDecoration == null) {
                return;
            }
            this.location = picDecoration.location;
            this.name = picDecoration.name;
            this.decoration_info = Message.copyOf(picDecoration.decoration_info);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PicDecoration build(boolean z) {
            return new PicDecoration(this, z);
        }
    }

    public PicDecoration(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.location;
            if (str == null) {
                this.location = "";
            } else {
                this.location = str;
            }
            String str2 = builder.name;
            if (str2 == null) {
                this.name = "";
            } else {
                this.name = str2;
            }
            List<FeedKV> list = builder.decoration_info;
            if (list == null) {
                this.decoration_info = DEFAULT_DECORATION_INFO;
                return;
            } else {
                this.decoration_info = Message.immutableCopyOf(list);
                return;
            }
        }
        this.location = builder.location;
        this.name = builder.name;
        this.decoration_info = Message.immutableCopyOf(builder.decoration_info);
    }
}
