package tbclient.VideoRedIcon;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
/* loaded from: classes2.dex */
public final class RedIcon extends Message {
    public static final String DEFAULT_IMAGE = "";
    public static final String DEFAULT_TEXT = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String image;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<ThreadInfo> thread_list;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Integer DEFAULT_TYPE = 0;
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<RedIcon> {
        public String image;
        public String text;
        public List<ThreadInfo> thread_list;
        public Integer type;

        public Builder() {
        }

        public Builder(RedIcon redIcon) {
            super(redIcon);
            if (redIcon == null) {
                return;
            }
            this.type = redIcon.type;
            this.text = redIcon.text;
            this.image = redIcon.image;
            this.thread_list = Message.copyOf(redIcon.thread_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RedIcon build(boolean z) {
            return new RedIcon(this, z);
        }
    }

    public RedIcon(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            String str2 = builder.image;
            if (str2 == null) {
                this.image = "";
            } else {
                this.image = str2;
            }
            List<ThreadInfo> list = builder.thread_list;
            if (list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
                return;
            } else {
                this.thread_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.type = builder.type;
        this.text = builder.text;
        this.image = builder.image;
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
    }
}
