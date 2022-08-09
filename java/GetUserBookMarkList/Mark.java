package tbclient.GetUserBookMarkList;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class Mark extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BOOK_ID = "";
    public static final Long DEFAULT_CHAPTER_ID;
    public static final String DEFAULT_CHAPTER_TITLE = "";
    public static final String DEFAULT_CONTENT = "";
    public static final Integer DEFAULT_PAGE_ID;
    public static final Integer DEFAULT_PARAGRAPH_ID;
    public static final Long DEFAULT_POSITION;
    public static final Integer DEFAULT_UPDATE_TIME;
    public static final Integer DEFAULT_WORD_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String book_id;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long chapter_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String chapter_title;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer page_id;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer paragraph_id;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long position;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer update_time;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer word_id;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Mark> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String book_id;
        public Long chapter_id;
        public String chapter_title;
        public String content;
        public Integer page_id;
        public Integer paragraph_id;
        public Long position;
        public Integer update_time;
        public Integer word_id;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Mark mark) {
            super(mark);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {mark};
                interceptable.invokeUnInit(65537, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (mark == null) {
                return;
            }
            this.book_id = mark.book_id;
            this.chapter_id = mark.chapter_id;
            this.chapter_title = mark.chapter_title;
            this.page_id = mark.page_id;
            this.paragraph_id = mark.paragraph_id;
            this.word_id = mark.word_id;
            this.position = mark.position;
            this.content = mark.content;
            this.update_time = mark.update_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Mark build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new Mark(this, z, null) : (Mark) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1970573142, "Ltbclient/GetUserBookMarkList/Mark;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1970573142, "Ltbclient/GetUserBookMarkList/Mark;");
                return;
            }
        }
        DEFAULT_CHAPTER_ID = 0L;
        DEFAULT_PAGE_ID = 0;
        DEFAULT_PARAGRAPH_ID = 0;
        DEFAULT_WORD_ID = 0;
        DEFAULT_POSITION = 0L;
        DEFAULT_UPDATE_TIME = 0;
    }

    public /* synthetic */ Mark(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mark(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.book_id;
            if (str == null) {
                this.book_id = "";
            } else {
                this.book_id = str;
            }
            Long l = builder.chapter_id;
            if (l == null) {
                this.chapter_id = DEFAULT_CHAPTER_ID;
            } else {
                this.chapter_id = l;
            }
            String str2 = builder.chapter_title;
            if (str2 == null) {
                this.chapter_title = "";
            } else {
                this.chapter_title = str2;
            }
            Integer num = builder.page_id;
            if (num == null) {
                this.page_id = DEFAULT_PAGE_ID;
            } else {
                this.page_id = num;
            }
            Integer num2 = builder.paragraph_id;
            if (num2 == null) {
                this.paragraph_id = DEFAULT_PARAGRAPH_ID;
            } else {
                this.paragraph_id = num2;
            }
            Integer num3 = builder.word_id;
            if (num3 == null) {
                this.word_id = DEFAULT_WORD_ID;
            } else {
                this.word_id = num3;
            }
            Long l2 = builder.position;
            if (l2 == null) {
                this.position = DEFAULT_POSITION;
            } else {
                this.position = l2;
            }
            String str3 = builder.content;
            if (str3 == null) {
                this.content = "";
            } else {
                this.content = str3;
            }
            Integer num4 = builder.update_time;
            if (num4 == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
                return;
            } else {
                this.update_time = num4;
                return;
            }
        }
        this.book_id = builder.book_id;
        this.chapter_id = builder.chapter_id;
        this.chapter_title = builder.chapter_title;
        this.page_id = builder.page_id;
        this.paragraph_id = builder.paragraph_id;
        this.word_id = builder.word_id;
        this.position = builder.position;
        this.content = builder.content;
        this.update_time = builder.update_time;
    }
}
