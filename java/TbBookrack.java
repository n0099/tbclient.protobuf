package tbclient;

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
import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public final class TbBookrack extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BOOKTOWN = "";
    public static final List<BookInfo> DEFAULT_BOOK_LIST;
    public static final String DEFAULT_ICON = "";
    public static final Integer DEFAULT_NUM;
    public static final String DEFAULT_TIP = "";
    public static final String DEFAULT_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<BookInfo> book_list;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String booktown;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer num;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String tip;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<TbBookrack> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<BookInfo> book_list;
        public String booktown;
        public String icon;
        public Integer num;
        public String tip;
        public String title;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(TbBookrack tbBookrack) {
            super(tbBookrack);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {tbBookrack};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (tbBookrack == null) {
                return;
            }
            this.booktown = tbBookrack.booktown;
            this.num = tbBookrack.num;
            this.book_list = Message.copyOf(tbBookrack.book_list);
            this.title = tbBookrack.title;
            this.icon = tbBookrack.icon;
            this.tip = tbBookrack.tip;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TbBookrack build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new TbBookrack(this, z, null) : (TbBookrack) invokeZ.objValue;
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1292287235, "Ltbclient/TbBookrack;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1292287235, "Ltbclient/TbBookrack;");
                return;
            }
        }
        DEFAULT_NUM = 0;
        DEFAULT_BOOK_LIST = Collections.emptyList();
    }

    public /* synthetic */ TbBookrack(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TbBookrack(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.booktown;
            if (str == null) {
                this.booktown = "";
            } else {
                this.booktown = str;
            }
            Integer num = builder.num;
            if (num == null) {
                this.num = DEFAULT_NUM;
            } else {
                this.num = num;
            }
            List<BookInfo> list = builder.book_list;
            if (list == null) {
                this.book_list = DEFAULT_BOOK_LIST;
            } else {
                this.book_list = Message.immutableCopyOf(list);
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            String str3 = builder.icon;
            if (str3 == null) {
                this.icon = "";
            } else {
                this.icon = str3;
            }
            String str4 = builder.tip;
            if (str4 == null) {
                this.tip = "";
                return;
            } else {
                this.tip = str4;
                return;
            }
        }
        this.booktown = builder.booktown;
        this.num = builder.num;
        this.book_list = Message.immutableCopyOf(builder.book_list);
        this.title = builder.title;
        this.icon = builder.icon;
        this.tip = builder.tip;
    }
}
